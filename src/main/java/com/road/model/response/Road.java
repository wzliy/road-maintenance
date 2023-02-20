package com.road.model.response;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 道路信息
 */
@Schema(description = "道路信息")
public class Road {
    @Schema(description = "道路id")
    private String id;
    @Schema(description = "道路名称")
    private String name;
    @Schema(description = "道路到请求坐标的距离")
    private String distance;
    @Schema(description = "方位")
    private String direction;
    @Schema(description = "坐标点")
    private String location;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
