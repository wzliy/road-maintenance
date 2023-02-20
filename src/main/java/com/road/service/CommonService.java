package com.road.service;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.qcloud.cos.model.PutObjectResult;
import com.road.common.client.RestClient;
import com.road.model.response.GeocodeResponse;
import com.road.oss.TencentYunClient;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class CommonService {

    private final RestClient restClient;
    private final TencentYunClient tencentYunClient;

    public CommonService(RestClient restClient, TencentYunClient tencentYunClient) {
        this.restClient = restClient;
        this.tencentYunClient = tencentYunClient;
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

    /**
     * 上传文件
     * @param multipartFile 文件流参数
     */
    public String uploadFile(MultipartFile multipartFile) {
        String fileName = multipartFile.getOriginalFilename();
        assert fileName != null;
        String suffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());
        String requestKey = "road/" + System.currentTimeMillis() + suffix;


        try {
            File tempFile = File.createTempFile("temp", null);
            multipartFile.transferTo(tempFile);
            PutObjectResult putObjectResult = tencentYunClient.uploadFile(tempFile, requestKey);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String path = "https://maintenance-1253241117.cos.ap-guangzhou.myqcloud.com/" + requestKey;
        return path;


    }
}
