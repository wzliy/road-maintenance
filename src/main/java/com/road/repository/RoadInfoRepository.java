package com.road.repository;

import com.road.model.entity.RoadInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoadInfoRepository extends JpaRepository<RoadInfo, Long> {

    List<RoadInfo> findByStatus(String status);



}
