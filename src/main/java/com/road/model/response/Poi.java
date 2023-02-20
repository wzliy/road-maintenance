package com.road.model.response;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Poi信息
 */
@Schema(description = "poi信息")
public class Poi {
    @Schema(description = "poi的id")
    private String id;
    @Schema(description = "poi点名称")
    private String name;
    @Schema(description = "poi类型")
    private String type;
    @Schema(description = "电话")
    private String tel;
    @Schema(description = "该POI的中心点到请求坐标的距离")
    private String distance;
    @Schema(description = "方向")
    private String direction;
    @Schema(description = "poi地址信息")
    private String address;
    @Schema(description = "坐标点")
    private String location;
    @Schema(description = "poi所在商圈名称")
    private String businessarea;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBusinessarea() {
        return businessarea;
    }

    public void setBusinessarea(String businessarea) {
        this.businessarea = businessarea;
    }
}
