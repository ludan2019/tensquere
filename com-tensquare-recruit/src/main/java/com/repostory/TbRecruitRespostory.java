package com.repostory;

import com.pojo.TbRecruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TbRecruitRespostory extends JpaRepository<TbRecruit,Long> ,JpaSpecificationExecutor<TbRecruit> {

    List<TbRecruit> findTop4ByStateOrderByCreateTimeDesc(String state);

    List<TbRecruit> findTop12ByStateNotOrderByCreateTimeDesc(String state);
}
