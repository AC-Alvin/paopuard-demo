package com.baohua.paopuard.demo.service;

import com.baohua.paopuard.demo.util.DemoUtil;
import com.baohua.paopuard.demo.util.ResultCode;

/**
 * @Description:
 * @Author: alvin
 * @Date: 2020/10/14 21:41
 */
public class Service {

    public void test() {
        ResultCode code = DemoUtil.getCode(1);
        System.err.println(code);
    }

    public void test2() {
        String s = DemoUtil.genId();
        System.err.println(s);
    }
}
