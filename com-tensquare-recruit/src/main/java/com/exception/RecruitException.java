package com.exception;

import com.excepition.CommonExcepition;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum RecruitException implements CommonExcepition {
    NOT_FIND_ISHOT_ENTERPRISE(HttpStatus.NOT_FOUND.value(),"未发现热门企业"),
    NOT_FIND_STATE2_ENTERPRISE(HttpStatus.NOT_FOUND.value(),"未发现热门企业");
    private Integer code;
    private String message;
}
