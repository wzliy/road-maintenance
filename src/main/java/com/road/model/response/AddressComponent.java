package com.road.model.response;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 地址元素
 */
public class AddressComponent {
    // 所在省
    @Schema(description = "所在省")
    private String province;

    // 所在城市
    @Schema(description = "所在城市")
    private String city;

    // 城市编码
    @Schema(description = "城市编码")
    private String citycode;

    // 所在区
    @Schema(description = "所在区")
    private String district;

    // 区域编码
    @Schema(description = "区域编码")
    private String adcode;

    // 坐标点所在乡镇/街道
    @Schema(description = "坐标点所在乡镇/街道")
    private String township;

    // 乡镇街道编码
    @Schema(description = "乡镇街道编码")
    private String towncode;

    // 社区信息
    @Schema(description = "社区信息")
    private Neighborhood neighborhood;

    // 楼信息列表
    @Schema(description = "楼信息列表")
    private Building building;

    // 门牌信息列表
    @Schema(description = "门牌信息列表")
    private StreetNumber streetNumber;

    // 所属海域信息
    @Schema(description = "所属海域信息")
    private String seaArea;

    // 经纬度所属商圈列表
    @Schema(description = "经纬度所属商圈列表")
    private BusinessAreas businessAreas;

    private static class Neighborhood {
        // 社区名称
        @Schema(description = "社区名称")
        private String name;
        // POI类型
        @Schema(description = "POI类型")
        private String type;

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
    }

    private static class Building {
        @Schema(description = "建筑名称")
        private String name;
        @Schema(description = "类型")
        private String type;

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
    }

    private static class StreetNumber {
        @Schema(description = "街道名称")
        private String street;
        @Schema(description = "门牌号")
        private String number;
        @Schema(description = "坐标点")
        private String location;
        @Schema(description = "方向")
        private String direction;
        @Schema(description = "门牌地址到请求坐标的距离")
        private String distance;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }
    }

    private static class BusinessAreas {
        @Schema(description = "商圈信息")
        private String businessArea;
        @Schema(description = "商圈中心点经纬度")
        private String location;
        @Schema(description = "商圈名称")
        private String name;
        @Schema(description = "商圈所在区域的adcode")
        private String id;

        public String getBusinessArea() {
            return businessArea;
        }

        public void setBusinessArea(String businessArea) {
            this.businessArea = businessArea;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public String getTowncode() {
        return towncode;
    }

    public void setTowncode(String towncode) {
        this.towncode = towncode;
    }

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public StreetNumber getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(StreetNumber streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getSeaArea() {
        return seaArea;
    }

    public void setSeaArea(String seaArea) {
        this.seaArea = seaArea;
    }

    public BusinessAreas getBusinessAreas() {
        return businessAreas;
    }

    public void setBusinessAreas(BusinessAreas businessAreas) {
        this.businessAreas = businessAreas;
    }
}
