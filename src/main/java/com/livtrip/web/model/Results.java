package com.livtrip.web.model;

/**
 * Created by xierongli on 17/6/16.
 */
public class Results {

    private static final String SUCCESS = "success";
    private static final String ERROR = "error";

    public Results() {
    }

    public static <T> Result<T> newSuccessResult(T data) {
        return newResult(data, SUCCESS, true);
    }

    public static <T> Result<T> newFailedResult() {
        return newResult(null, ERROR, false);
    }


    public static <T> Result<T> newFailedResult(String message) {
        return newResult(null, message, false);
    }

    public static <T> Result<T> newResult(T data, String message, boolean success) {
        Result result = new Result();
        result.setData(data);
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }
}
