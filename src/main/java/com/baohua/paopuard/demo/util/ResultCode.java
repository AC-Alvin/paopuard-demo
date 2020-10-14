package com.baohua.paopuard.demo.util;

/**
 * @ClassName ResultCode
 * @Description
 * @Author alvin
 * @Date 2020/9/1 15:58
 * @Version V1.0
 **/
public enum ResultCode {
    /**
     * 失败
     */
    FAILED(-1, "操作失败"),
    /**
     * 成功
     */
    SUCCESS(1, "执行成功"),

    PARAMETER_ERROR(2, "参数错误"),

    DB_ERROR(3, "数据库错误"),
    NOT_LOGIN(4, "用户没有登录"),
    NOT_BINDDING(5, "请先绑定微信账号"),
    FREEZE(6, "账户被冻结，请联系客服");


    private int code;
    private String msg;

    ResultCode(int code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static ResultCode fromCode(long code) {
        ResultCode[] ecs = ResultCode.values();
        for (ResultCode ec : ecs) {
            if (ec.getCode() == code) {
                return ec;
            }
        }
        return SUCCESS;
    }

}
