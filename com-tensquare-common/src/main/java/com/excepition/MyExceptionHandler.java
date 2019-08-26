package com.excepition;

import com.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class MyExceptionHandler {


    @ExceptionHandler(value=RuntimeException.class)
    @ResponseBody
    public Result myExceptionHander(HttpServletRequest request, Throwable e){
        e.printStackTrace();
        if(e instanceof MyExcepition){
            MyExcepition myExcepition = (MyExcepition) e;
            log.error(request.getRequestURL()+"---"+myExcepition.getCode()+myExcepition.getMessage());
            return new Result(false,myExcepition.getCode(),e.getMessage(),null);
        }
        log.error(request.getRequestURL()+"---"+e.getMessage()+"---"+e.getStackTrace());
        return new Result(false,201,"访问异常，请稍候再试",null);
    }
}
