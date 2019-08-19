package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Result {
    private Boolean flag;
    private Integer code;
    private String message;
    private Object data;


/*    public Result(boolean flag, int code, String message, Object data) {
        this.code=code;
        this.flag=flag;
        this.message=message;
        this.data = data;
    }*/
}
