package com.jy.Exception;

/**
 * @description: 自定义异常
 * @author: huyu
 * @create: 2019-08-27 15:26
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -4168510001632013423L;

    private String code; //错误编码
    private String msg; //异常信息

    public BusinessException() {}

    public BusinessException(Exception e) {
        super(e);
        this.msg = e.getMessage();
    }

    public BusinessException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public BusinessException setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public BusinessException setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
