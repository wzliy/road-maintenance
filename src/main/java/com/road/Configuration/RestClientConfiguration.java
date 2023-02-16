package com.road.Configuration;

import com.road.common.client.CommonRestTemplateCustomizer;
import com.road.common.client.RestClient;
import com.road.properties.RestTemplateProperties;
import org.apache.hc.client5.http.HttpRoute;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.io.HttpClientConnectionManager;
import org.apache.hc.client5.http.socket.ConnectionSocketFactory;
import org.apache.hc.client5.http.socket.PlainConnectionSocketFactory;
import org.apache.hc.client5.http.ssl.NoopHostnameVerifier;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.config.Registry;
import org.apache.hc.core5.http.config.RegistryBuilder;
import org.apache.hc.core5.ssl.SSLContextBuilder;
import org.apache.hc.core5.ssl.TrustStrategy;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.lang.Nullable;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * 客户端工具自动化配置
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnClass(RestClient.class)
@EnableConfigurationProperties(RestTemplateProperties.class)
@AutoConfigureAfter({RestTemplateAutoConfiguration.class})
@ConditionalOnProperty(name = "jxjt.rest-template.enabled", havingValue = "true", matchIfMissing = true)
public class RestClientConfiguration {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder,
                                     @Nullable List<ClientHttpRequestInterceptor> interceptors) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        if (!CollectionUtils.isEmpty(interceptors)) {
            for (ClientHttpRequestInterceptor interceptor : interceptors) {
                restTemplate.getInterceptors().add(interceptor);
            }
        }
        return restTemplate;
    }

    @Bean
    @ConditionalOnMissingBean(CommonRestTemplateCustomizer.class)
    public CommonRestTemplateCustomizer commonRestTemplateCustomizer(HttpClient httpClient) {
        return new CommonRestTemplateCustomizer(httpClient);
    }

    @Bean
    @ConditionalOnMissingBean(HttpClient.class)
    public HttpClient httpClient(HttpClientConnectionManager httpClientConnectionManager) {
        HttpClientBuilder builder = HttpClientBuilder.create();


        builder.setConnectionManager(httpClientConnectionManager);
        return builder.build();
    }

    @Bean
    public HttpClientConnectionManager httpClientConnectionManager(RestTemplateProperties properties, SSLContext sslContext) throws URISyntaxException {
        HostnameVerifier hostnameVerifier = NoopHostnameVerifier.INSTANCE;

        SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(sslContext, hostnameVerifier);
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", PlainConnectionSocketFactory.getSocketFactory())
                .register("https", sslSocketFactory)
                .build();

        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
        connectionManager.setMaxTotal(properties.getMaxTotal());
        connectionManager.setDefaultMaxPerRoute(properties.getMaxPerRoute());
        for (RestTemplateProperties.MaxPerRoute hostRoute : properties.getHostRoutes()) {
            HttpHost httpHost = HttpHost.create(hostRoute.getHost());
            connectionManager.setMaxPerRoute(new HttpRoute(httpHost), hostRoute.getMaxRoute());
        }

        return connectionManager;
    }

    @Bean
    public SSLContext sslContext() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        // 设置信任所有证书
        TrustStrategy acceptingTrustStrategy = (x509Certificates, s) -> true;
        return new SSLContextBuilder().loadTrustMaterial(null, acceptingTrustStrategy).build();
    }

    @Bean
    @ConditionalOnMissingBean(RestClient.class)
    public RestClient restClient(RestTemplate restTemplate) {
        return new RestClient(restTemplate);
    }
}
