package com.road.common.api;

public class ResultUtil {

    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<>(ResultCodeEnum.SUCCESS.getCode(),
                ResultCodeEnum.SUCCESS.getMessage(), data);
    }

    public static <T> ApiResult<T> success() {
        return success(null);
    }

    public static <T> ApiResult<T> error(String msg) {
        return new ApiResult<>(ResultCodeEnum.ERROR.getCode(), msg, null);
    }

    public static <T> ApiResult<T> error() {
        return error(ResultCodeEnum.ERROR.getMessage());
    }
}
