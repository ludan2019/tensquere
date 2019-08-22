package com;

import com.excepition.MyExcepition;
import com.exception.BaseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.ExceptionHandler;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BaseTest {

    @Test
    public void insOf(){
        Throwable throwable = new NullPointerException();
        System.out.println(throwable instanceof MyExcepition);
    }
}
