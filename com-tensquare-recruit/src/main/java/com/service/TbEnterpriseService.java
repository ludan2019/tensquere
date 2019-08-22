package com.service;

import com.excepition.MyExcepition;
import com.exception.RecruitException;
import com.pojo.TbEnterprise;
import com.repostory.TbEnterpriseRespostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbEnterpriseService {

    @Autowired
    private TbEnterpriseRespostory tbEnterpriseRespostory;

    public List<TbEnterprise> findByIsShot(String shot){

        List<TbEnterprise> byIsShot = tbEnterpriseRespostory.findByIshot(shot);
        if(byIsShot.isEmpty()){
            throw new MyExcepition(RecruitException.NOT_FIND_ISHOT_ENTERPRISE);
        }
        return byIsShot;
    }
}
