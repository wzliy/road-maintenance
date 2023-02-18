package com.road.controller;

import com.road.common.api.ApiResult;
import com.road.common.api.ResultUtil;
import com.road.model.entity.RoadInfo;
import com.road.model.param.RoadInfoParam;
import com.road.service.RoadService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 道路信息维护
 */
@RestController
@RequestMapping("/road")
@Tag(name = "道路维护信息接口")
public class RoadController {

    private final RoadService roadService;

    public RoadController(RoadService roadService) {
        this.roadService = roadService;
    }

    @Operation(summary = "新增道路维护信息")
    @PostMapping("/add")
    public ApiResult<RoadInfo> addRoadInfo(@Valid @RequestBody RoadInfoParam roadInfoParam) {
        return ResultUtil.success(roadService.add(roadInfoParam));
    }


    @Operation(summary = "查询道路维护信息")
    @GetMapping("/findList")
    public ApiResult<List<RoadInfo>> findRoadInfoList() {
        return ResultUtil.success(roadService.findList());
    }

    @Operation(summary = "更新道路维护信息")
    @PostMapping("/update")
    public ApiResult<RoadInfo> update(@RequestBody RoadInfo roadInfo) {
        return ResultUtil.success(roadService.update(roadInfo));
    }

    @Operation(summary = "删除道路维护信息")
    @GetMapping("/delete/{id}")
    public ApiResult<Boolean> delete(@PathVariable Long id) {
        roadService.delete(id);
        return ResultUtil.success();
    }

}
