package com.road.controller;

import com.road.common.api.ApiResult;
import com.road.common.api.ResultUtil;
import com.road.model.RoadInfo;
import com.road.service.CommonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 公共服务
 */
@RestController
@RequestMapping("/common")
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
    public ApiResult<String> reverse(@RequestParam String location) {
        return ResultUtil.success(commonService.reverse(location));
    }

}
