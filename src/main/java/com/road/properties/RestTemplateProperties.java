package com.road.properties;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

/**
 * RestTemplate 定制化参数
 * 项目启动时可使用默认配置，也可以通过properties或yml文件配置相关参数
 * @author zlwang
 */
@Validated
@ConfigurationProperties(prefix = "rest-template")
public class RestTemplateProperties {
    /**
     * 连接时间
     */
    private int connectTimeout = 5000;

    private int readTimeout = 30000;

    private boolean bufferRequestBody = true;

    @Max(value = 1000)
    private int maxPerRoute = 20;

    private int maxTotal = 200;

    private List<MaxPerRoute> hostRoutes = new ArrayList<>();

    public class MaxPerRoute {

        @NotBlank
        private String host;

        @Min(value = 2)
        private int maxRoute;

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public int getMaxRoute() {
            return maxRoute;
        }

        public void setMaxRoute(int maxRoute) {
            this.maxRoute = maxRoute;
        }
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public boolean isBufferRequestBody() {
        return bufferRequestBody;
    }

    public void setBufferRequestBody(boolean bufferRequestBody) {
        this.bufferRequestBody = bufferRequestBody;
    }

    public int getMaxPerRoute() {
        return maxPerRoute;
    }

    public void setMaxPerRoute(int maxPerRoute) {
        this.maxPerRoute = maxPerRoute;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public List<MaxPerRoute> getHostRoutes() {
        return hostRoutes;
    }

    public void setHostRoutes(List<MaxPerRoute> hostRoutes) {
        this.hostRoutes = hostRoutes;
    }
}
