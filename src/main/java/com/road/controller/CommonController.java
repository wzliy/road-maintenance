package com.road.controller;

import com.road.common.api.ApiResult;
import com.road.common.api.ResultUtil;
import com.road.model.response.GeocodeResponse;
import com.road.service.CommonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 公共服务
 */
@RestController
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

}
