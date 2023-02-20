package com.road.model;

public enum RoadStatusEnum {
    REGISTERED("registered", "已登记"),
    RECTIFIED("rectified", "已整改"),
    ;
    private String code;
    private String message;

    RoadStatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
