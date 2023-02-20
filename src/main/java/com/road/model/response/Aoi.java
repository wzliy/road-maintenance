package com.road.model.response;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * aoi信息
 */
@Schema(description = "aoi信息")
public class Aoi {
    @Schema(description = "所属 aoi的id")
    private String id;
    @Schema(description = "所属 aoi 名称")
    private String name;
    @Schema(description = "所属 aoi 所在区域编码")
    private String adcode;
    @Schema(description = "所属 aoi 中心点坐标")
    private String location;
    @Schema(description = "所属aoi点面积")
    private String area;
    @Schema(description = "输入经纬度是否在aoi面之中")
    private String distance;
    @Schema(description = "所属 aoi 类型")
    private String type;

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

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
