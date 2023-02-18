package com.road.service;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.road.common.client.RestClient;
import com.road.model.response.GeocodeResponse;
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


    public GeocodeResponse reverse(String location) {
        String url = "https://restapi.amap.com/v3/geocode/regeo?key={key}&location={location}&extensions=all";
        String key = "ad14d86b590ad52e304a8731fa2ac843";

        Map<String, Object> params = new HashMap<>();
        params.put("key", key);
        params.put("location", location);

        String response = restClient.getForObject(url, null, params, null, String.class);
        JSONObject jsonObject = JSONUtil.parseObj(response);
        String status = jsonObject.getStr("status");
        if ("1".equals(status)) {
            String geocodes = jsonObject.getStr("regeocode");
            GeocodeResponse geocodeResponse = JSONUtil.toBean(geocodes, GeocodeResponse.class);
            return geocodeResponse;
        }
        return null;
    }
}
