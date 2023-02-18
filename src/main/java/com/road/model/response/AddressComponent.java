package com.road.model.response;

/**
 * 地址元素
 */
public class AddressComponent {
    // 所在省
    private String province;

    // 所在城市
    private String city;

    // 城市编码
    private String citycode;

    // 所在区
    private String district;

    // 区域编码
    private String adcode;

    // 坐标点所在乡镇/街道
    private String township;

    // 乡镇街道编码
    private String towncode;

    // 社区信息
    private Neighborhood neighborhood;

    // 楼信息列表
    private Building building;

    // 门牌信息列表
    private StreetNumber streetNumber;

    // 所属海域信息
    private String seaArea;

    // 经纬度所属商圈列表
    private BusinessAreas businessAreas;

    private static class Neighborhood {
        private String name;
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



    private class Building {
        private String name;
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

    private class StreetNumber {
        private String street;
        private String number;
        private String location;
        private String direction;
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

    private class BusinessAreas {

        private String businessArea;
        private String location;
        private String name;
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
