package com.excepiton;

import com.excepition.CommonExcepition;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ArticleException implements CommonExcepition {
    NOT_FIND_ARTICLE(HttpStatus.NOT_FOUND.value(),"未发现文章");

    private Integer code;
    private String message;
}
