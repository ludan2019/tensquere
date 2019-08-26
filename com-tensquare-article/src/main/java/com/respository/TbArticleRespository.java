package com.respository;

import com.pojo.TbArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TbArticleRespository extends JpaRepository<TbArticle,Long>,JpaSpecificationExecutor<TbArticle> {

    @Modifying
    @Query("update TbArticle set state='1' where id = ?1")
    void examine(Long id);

    @Modifying
    @Query("update TbArticle set thumbup=thumbup+1 where id = ?1")
    void updateThumbup(Long id);
}
