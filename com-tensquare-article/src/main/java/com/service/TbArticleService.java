package com.service;

import com.excepition.MyExcepition;
import com.excepiton.ArticleException;
import com.pojo.TbArticle;
import com.respository.TbArticleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.concurrent.TimeUnit;

@Service
public class TbArticleService {
    @Autowired
    private TbArticleRespository tbArticleRespository;

    @Autowired
    private RedisTemplate template;

    @Transactional
    public void examine(Long id){
        tbArticleRespository.examine(id);
    }

    @Transactional
    public void updateThumpup(Long id){
        tbArticleRespository.updateThumbup(id);
    }

    public TbArticle findById(Long id){
        BoundValueOperations boundValueOperations = template.boundValueOps("article_" + id);
        try {
            TbArticle tbArticle = (TbArticle) boundValueOperations.get();
            if(tbArticle!=null){
                return tbArticle;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        TbArticle daoTbArticle = tbArticleRespository.findById(id).get();
        if(daoTbArticle == null){
            throw new MyExcepition(ArticleException.NOT_FIND_ARTICLE);
        }
        try {
            boundValueOperations.set(daoTbArticle,60,TimeUnit.MINUTES);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return daoTbArticle;
    }
}
