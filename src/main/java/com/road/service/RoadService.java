package com.road.service;

import com.road.model.RoadInfo;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * 道路信息维护类
 */
@Service
public class RoadService {

    /**
     * 查询道路信息维护列表
     * @return roadInfoList
     */
    public List<RoadInfo> findList() {
        RoadInfo roadInfo = new RoadInfo();
        roadInfo.setId(1);
        return Collections.singletonList(roadInfo);
    }

    /**
     * 新增道路维护信息
     * @param roadInfo 道路维护信息类
     * @return 新增结果
     */
    public Boolean add(RoadInfo roadInfo) {
        return true;
    }

    /**
     * 更新道路维护信息
     * @param roadInfo 道路维护信息更新类
     * @return 更新结果
     */
    public Boolean update(RoadInfo roadInfo) {
        return true;
    }

    public Boolean delete(int id) {
        return true;
    }
}
