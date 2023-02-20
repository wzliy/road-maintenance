package com.road.model.response;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 道路交叉口
 */
@Schema(description = "道路交叉口")
public class Roadinter {
    @Schema(description = "交叉路口到请求坐标的距离")
    private String distance;
    @Schema(description = "方位")
    private String direction;
    @Schema(description = "路口经纬度")
    private String location;
    @Schema(description = "第一条道路id")
    private String first_id;
    @Schema(description = "第一条道路名称")
    private String first_name;
    @Schema(description = "第二条道路id")
    private String second_id;
    @Schema(description = "第二条道路名称")
    private String second_name;

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

    public String getFirst_id() {
        return first_id;
    }

    public void setFirst_id(String first_id) {
        this.first_id = first_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_id() {
        return second_id;
    }

    public void setSecond_id(String second_id) {
        this.second_id = second_id;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }
}
