package com.road.controller;

import com.road.common.api.ApiResult;
import com.road.common.api.ResultUtil;
import com.road.model.response.GeocodeResponse;
import com.road.service.CommonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * 公共服务
 */
@RestController
@CrossOrigin
@RequestMapping("/common")
@Tag(name = "通用接口")
public class CommonController {

    private final CommonService commonService;

    public CommonController(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * 逆地理编码
     * @return 地址信息
     */
    @GetMapping("/reverse")
    @Operation(summary = "地址转换", description = "通过经纬度转换成地理位置")
    public ApiResult<GeocodeResponse> reverse(@Parameter(name = "location", description = "经纬度") @RequestParam String location) {
        return ResultUtil.success(commonService.reverse(location));
    }


    /**
     * 上传文件
     * @param multipartFile 文件流
     * @return 文件地址
     */
    @PostMapping(name = "/file/upload", headers = "content-type=multipart/form-data")
    @Operation(summary = "文件上传", description = "文件上传接口")
    public ApiResult<String> uploadFile(@RequestParam("uploadFile") MultipartFile multipartFile){
        return ResultUtil.success(commonService.uploadFile(multipartFile));
    }


}
