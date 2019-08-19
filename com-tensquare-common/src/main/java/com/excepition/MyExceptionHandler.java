package com.excepition;

import com.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionHandler {


    @ExceptionHandler(value=RuntimeException.class)
    @ResponseBody
    public Result myExceptionHander(MyExcepition e){
        return new Result(false,e.getCode(),e.getMessage(),null);
    }
}
