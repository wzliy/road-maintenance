package com.road.common.client;

import org.apache.hc.client5.http.classic.HttpClient;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
public class CommonRestTemplateCustomizer implements RestTemplateCustomizer {
    private final HttpClient httpClient;

    public CommonRestTemplateCustomizer(HttpClient httpClient) {
        this.httpClient = httpClient;
    }


    @Override
    public void customize(RestTemplate restTemplate) {
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient);
        restTemplate.setRequestFactory(factory);
    }
}
