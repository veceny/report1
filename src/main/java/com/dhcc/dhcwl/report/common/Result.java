package com.dhcc.dhcwl.report.common;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @ProjectName: report
 * @Filename: Test
 * @Author: veceny
 * @Date: 2022/9/25:16:04
 * @Description: TODO
 */

@Api(tags = "统一返回接口说明")
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 6308315887056661996L;
    @ApiModelProperty(notes = "返回编码")
    private Integer code;
    @ApiModelProperty(notes = "返回消息")
    private String message;
    @ApiModelProperty(notes = "返回数据信息")
    private T data;


    public Result setResult(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        return this;
    }

    public Result setResult(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.setData(data);
        return this;
    }

    // 成功返回数据
    public static Result ok(Object data) {
        return new Result()
                .setResult(ResultCode.RC100, data);


    }

    // 成功返回数据
    public static Result failure(Object data) {
        return new Result()
                .setResult(ResultCode.RC999, data);


    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
