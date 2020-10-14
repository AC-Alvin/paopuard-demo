package com.baohua.paopuard.demo.util;

/**
 * @Description:
 * @Author: alvin
 * @Date: 2020/10/14 21:17
 */
public class PropuardUtil {

    public static ResultCode resultCode() {
        return ResultCode.SUCCESS;
    }

    public static ResultCode getCode(int code) {
        return ResultCode.fromCode(code);
    }
}
