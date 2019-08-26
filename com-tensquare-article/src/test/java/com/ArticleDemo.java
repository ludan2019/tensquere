package com;

import com.respository.TbArticleRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ArticleDemo {
    @Autowired
    private TbArticleRespository tbArticleRespository;

    @Test
    @Rollback(false)
    @Transactional
    public void updateDemo01(){
        tbArticleRespository.examine(1l);
    }

    @Test
    @Rollback(false)
    @Transactional
    public void updateDemo02(){
        tbArticleRespository.updateThumbup(1l);
    }
}
