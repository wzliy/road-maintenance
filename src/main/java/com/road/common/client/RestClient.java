package com.road.common.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Map;

/**
 * 基于RestTemplate封装REST接口调用工具类。
 */
public class RestClient {
    private final RestTemplate template;

    public RestClient(RestTemplate template) {
        this.template = template;
    }

    public RestTemplate getTemplate() {
        return template;
    }

    /**
     * 以get方式调用接口，返回指定类型的结果对象
     * @param url 请求地址
     * @param uriVariables 请求的url参数map
     * @param tClass 请求体中的对象类型
     * @param <T> 返回的请求对象
     * @return 接口返回的结果对象
     */
    public <T> T getForObject(String url, Object request, Map<String, Object> uriVariables,
                              HttpHeaders headers, Class<T> tClass) {
        return exchange(url, HttpMethod.GET, request, uriVariables, headers, tClass);
    }

    /**
     * 以post方式调用接口，返回指定类型的结果对象
     * @param url 请求地址
     * @param uriVariables 请求的url参数map
     * @param tClass 请求体中的对象类型
     * @param <T> 返回的请求对象
     * @return 接口返回的结果对象
     */
    public <T> T postForObject(String url, Object request, Map<String, Object> uriVariables,
                               HttpHeaders headers, Class<T> tClass) {
        return exchange(url, HttpMethod.POST, request, uriVariables, headers, tClass);
    }

    public <T> T postFormData(String url, MultiValueMap<String, Object> parameter, HttpHeaders headers, Class<T> tClass) {
        HttpEntity<MultiValueMap<String, Object>> param = new HttpEntity<>(parameter, headers);
        //发起请求,服务地址，请求参数，返回消息体的数据类型
        ResponseEntity<T> response = getTemplate().postForEntity(url, param, tClass);
        return response.getBody();
    }



    public<T> T exchange(String url, HttpMethod method, Object request, Map<String, Object> uriVariables,
                         HttpHeaders headers, Class<T> tClass) {
        HttpHeaders httpHeaders = headers == null ? new HttpHeaders() : headers;
        HttpEntity<Object> httpEntity = new HttpEntity<>(request, httpHeaders);
        uriVariables = uriVariables == null ? Collections.emptyMap() : uriVariables;
        ResponseEntity<T> responseEntity = getTemplate().exchange(url, method, httpEntity, tClass, uriVariables);
        return responseEntity.getBody();
    }
}
