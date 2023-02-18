package com.road.service;

import com.road.model.entity.RoadInfo;
import com.road.model.param.RoadInfoParam;
import com.road.repository.RoadInfoRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * 道路信息维护类
 */
@Service
public class RoadService {

    private final RoadInfoRepository roadInfoRepository;

    public RoadService(RoadInfoRepository roadInfoRepository) {
        this.roadInfoRepository = roadInfoRepository;
    }

    /**
     * 查询道路信息维护列表
     * @return roadInfoList
     */
    public List<RoadInfo> findList() {
        return roadInfoRepository.findAll();
    }

    /**
     * 新增道路维护信息
     * @param roadInfoParam 道路维护信息参数
     * @return 新增结果
     */
    public RoadInfo add(RoadInfoParam roadInfoParam) {
        RoadInfo roadInfo = new RoadInfo();
        roadInfo.setRoadName(roadInfoParam.getRoadName());
        return roadInfoRepository.save(roadInfo);
    }

    /**
     * 更新道路维护信息
     * @param roadInfo 道路维护信息更新类
     * @return 更新结果
     */
    public RoadInfo update(RoadInfo roadInfo) {
        return roadInfoRepository.save(roadInfo);
    }

    public void delete(Long id) {
        RoadInfo roadInfo = new RoadInfo();
        roadInfo.setId(id);
        roadInfoRepository.delete(roadInfo);
    }
}
