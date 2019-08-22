package com.controller;

import com.outresult.OuterResponseBody;
import com.pojo.TbEnterprise;
import com.pojo.TbRecruit;
import com.service.TbEnterpriseService;
import com.service.TbRecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("recruit")
public class RecruitController {

    @Autowired
    private TbEnterpriseService tbEnterpriseService;

    @Autowired
    private TbRecruitService tbRecruitService;

    @OuterResponseBody
    @GetMapping("search/ishot")
    public List<TbEnterprise> queryIshot(@RequestParam("ishot") String ishot){
        return tbEnterpriseService.findByIsShot(ishot);
    }

    @OuterResponseBody
    @GetMapping("search/recommend")
    public List<TbRecruit> queryIshot(){
        return tbRecruitService.findTop4ByStateOrderByCreatetimeDesc("2");
    }
}
