package com.road.model.param;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 道路维护信息实体
 */
@Schema(description = "道路维护信息参数")
public class RoadInfoParam {

    // 道路名
    @Schema(description = "道路名")
    private String roadName;

    // 地点
    @Schema(description = "地点")
    private String address;

    // 坐标(经纬度)
    @Schema(description = "坐标")
    private String location;

    // 发现单位
    @Schema(description = "发现单位")
    private String discoveryUnit;

    // 发现人员
    @Schema(description = "发现人员")
    private String discoveryStaff;

    // 路况描述
    @Schema(description = "路况描述")
    private String dangerDesc;

    // 隐患照片
    @Schema(description = "隐患照片")
    private String dangerPhoto;

    // 整改人员
    @Schema(description = "整改人员")
    private String rectificationStaff;

    // 整改单位
    @Schema(description = "整改单位")
    private String rectificationUnit;

    // 整改时间
    @Schema(description = "整改时间")
    private String rectificationTime;

    // 整改描述
    @Schema(description = "整改描述")
    private String rectificationDesc;

    // 整改图片
    @Schema(description = "整改图片")
    private String rectificationPhoto;

    // 状态
    @Schema(description = "状态")
    private String status;

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
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

    public String getDiscoveryUnit() {
        return discoveryUnit;
    }

    public void setDiscoveryUnit(String discoveryUnit) {
        this.discoveryUnit = discoveryUnit;
    }

    public String getDiscoveryStaff() {
        return discoveryStaff;
    }

    public void setDiscoveryStaff(String discoveryStaff) {
        this.discoveryStaff = discoveryStaff;
    }

    public String getDangerDesc() {
        return dangerDesc;
    }

    public void setDangerDesc(String dangerDesc) {
        this.dangerDesc = dangerDesc;
    }

    public String getDangerPhoto() {
        return dangerPhoto;
    }

    public void setDangerPhoto(String dangerPhoto) {
        this.dangerPhoto = dangerPhoto;
    }

    public String getRectificationStaff() {
        return rectificationStaff;
    }

    public void setRectificationStaff(String rectificationStaff) {
        this.rectificationStaff = rectificationStaff;
    }

    public String getRectificationUnit() {
        return rectificationUnit;
    }

    public void setRectificationUnit(String rectificationUnit) {
        this.rectificationUnit = rectificationUnit;
    }

    public String getRectificationTime() {
        return rectificationTime;
    }

    public void setRectificationTime(String rectificationTime) {
        this.rectificationTime = rectificationTime;
    }

    public String getRectificationDesc() {
        return rectificationDesc;
    }

    public void setRectificationDesc(String rectificationDesc) {
        this.rectificationDesc = rectificationDesc;
    }

    public String getRectificationPhoto() {
        return rectificationPhoto;
    }

    public void setRectificationPhoto(String rectificationPhoto) {
        this.rectificationPhoto = rectificationPhoto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
