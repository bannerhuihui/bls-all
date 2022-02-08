package com.bls.enu;

public enum ResultCodeEnum {
    /** 操作成功 */
    SUCCESS(2000, "操作成功"),

    /** 系统错误 */
    SYSTEM_FAILURE(5000, "系统错误"),

    /** 参数为空 */
    NULL_ARGUMENT(4004, "参数为空"),

    /** 参数不正确 */
    ILLEGAL_ARGUMENT(4005, "参数不正确"),

    /** 邮箱非法 */
    EMAIL_ILLEGAL(4006, "邮箱非法"),

    /** 手机号非法*/
    MOBILE_ILLEGAL(4007,"手机号非法"),

    /** 身份证号非法*/
    NUMBER_ILLEGAL(4008,"身份证号非法"),

    /** 用户名为空*/
    USER_NAME_NULL(4009,"用户名为空"),

    /** 用户不存在*/
    USER_NOT_FOND(4010,"用户不存在"),

    /** 用户密码错误*/
    USER_PWD_ERROR(4011,"用户密码错误"),

    /** 用户密码为空*/
    USER_PWD_NULL(4012,"用户密码错误"),

    /** 用户没有权限*/
    USER_AUTH_NOT_FOND(4013,"用户没有权限")

    ;

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ResultCodeEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
