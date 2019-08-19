package com.exception;

import com.excepition.CommonExcepition;
import com.excepition.MyExcepition;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum BaseException implements CommonExcepition {
    NOT_FIND_LABER(HttpStatus.NOT_FOUND.value(),"无相应的标签")
    ;
    private Integer code;
    private String message;
}
