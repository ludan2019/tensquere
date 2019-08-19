package com.outresult;

/**
 * created by ludan on 2017/09/25
 */

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OuterResponseBody {
}
