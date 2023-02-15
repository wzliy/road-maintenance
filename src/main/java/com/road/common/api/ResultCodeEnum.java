package com.road.common.api;

public enum ResultCodeEnum {
    SUCCESS("0000", "success"),
    ERROR("9999", "系统错误")
    ;

    private final String code;

    private final String message;

    ResultCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
