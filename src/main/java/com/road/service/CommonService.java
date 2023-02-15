package com.road.service;

import com.road.common.client.RestClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class CommonService {

    private final RestClient restClient;

    public CommonService(RestClient restClient) {
        this.restClient = restClient;
    }


    public String reverse(String location) {
        String url = "https://restapi.amap.com/v3/geocode/regeo";

        Map<String, Object> params = new HashMap<>();

        return restClient.getForObject(url, null, params, null, String.class);


    }
}
