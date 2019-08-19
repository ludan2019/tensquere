package com.excepition;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyExcepition extends RuntimeException {
    private Integer code;
    private String message;

    public MyExcepition(CommonExcepition e){
        this.code = e.getCode();
        this.message = e.getMessage();
    }
}
