package com.road.controller;

import com.road.common.api.ApiResult;
import com.road.common.api.ResultUtil;
import com.road.model.RoadInfo;
import com.road.service.RoadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 道路信息维护
 */
@RestController
@RequestMapping("/road")
public class RoadController {

    private final RoadService roadService;

    public RoadController(RoadService roadService) {
        this.roadService = roadService;
    }

    @PostMapping("/add")
    public ApiResult<Boolean> addRoadInfo(@RequestBody RoadInfo roadInfo) {
        return ResultUtil.success(roadService.add(roadInfo));
    }

    @GetMapping("/findList")
    public ApiResult<List<RoadInfo>> findRoadInfoList() {
        return ResultUtil.success(roadService.findList());
    }

    @PostMapping("/update")
    public ApiResult<Boolean> update(@RequestBody RoadInfo roadInfo) {
        return ResultUtil.success(roadService.update(roadInfo));
    }

    @GetMapping("/delete/{id}")
    public ApiResult<Boolean> delete(@PathVariable int id) {
        return ResultUtil.success(roadService.delete(id));
    }

}
