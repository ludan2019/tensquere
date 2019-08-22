package com.service;

import com.excepition.MyExcepition;
import com.exception.RecruitException;
import com.pojo.TbRecruit;
import com.repostory.TbRecruitRespostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbRecruitService {
    @Autowired
    private TbRecruitRespostory tbRecruitRespostory;

    public List<TbRecruit> findTop4ByStateOrderByCreatetimeDesc(String state){
        List<TbRecruit> list = tbRecruitRespostory.findTop4ByStateOrderByCreateTimeDesc(state);
        if(list.isEmpty()){
            throw new MyExcepition(RecruitException.NOT_FIND_STATE2_ENTERPRISE);
        }
        return list;
    }

    public List<TbRecruit> findTop12ByStateNotOrderByCreateTimeDesc(String state){
        List<TbRecruit> list = tbRecruitRespostory.findTop12ByStateNotOrderByCreateTimeDesc(state);
        if(list.isEmpty()){
            throw new MyExcepition(RecruitException.NOT_FIND_STATE2_ENTERPRISE);
        }
        return list;
    }
}
