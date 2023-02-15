package com.road.controller;

import com.road.common.api.ApiResult;
import com.road.common.api.ResultUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/road")
public class RoadController {

    @PostMapping("/add")
    public ApiResult<Boolean> addRoadInfo(@RequestBody String test) {
        return ResultUtil.success(true);
    }

}
