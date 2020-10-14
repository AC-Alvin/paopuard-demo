package com.baohua.paopuard.demo.util;

import java.util.Random;

/**
 * @Description:
 * @Author: alvin
 * @Date: 2020/10/14 21:14
 */
public class DemoUtil {

    private static int max_num = 100;
    private static String default_id = "11111";

    public static String genId() {
        int random = new Random().nextInt();
        if (random > max_num) {
            return String.valueOf(random);
        }
        return default_id;
    }

    public static ResultCode getCode(int code) {
        return PropuardUtil.getCode(code);
    }

    public static void getCode() {
        ResultCode resultCode = PropuardUtil.resultCode();
        System.err.println(resultCode);
    }
}
