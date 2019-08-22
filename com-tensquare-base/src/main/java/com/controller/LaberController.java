package com.controller;

import com.entity.PageResult;
import com.excepition.MyExcepition;
import com.exception.BaseException;
import com.outresult.OuterResponseBody;
import com.outresult.ResponseBodyWrapFactoryBean;
import com.pojo.Laber;
import com.server.LaberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("laber")
public class LaberController {

    @Autowired
    private LaberService laberService;

    @Autowired
    private ResponseBodyWrapFactoryBean responseBodyWrapFactoryBean;

    @OuterResponseBody
    @GetMapping
    public List<Laber> findAll(){
        return laberService.findAll();
    }

    @OuterResponseBody
    @GetMapping("/{id}")
    public Laber findById(@PathVariable("id") Long id){
        return laberService.finaById(id);
    }

    @OuterResponseBody
    @PostMapping
    public void saveLaber(@RequestBody Laber laber){
        laberService.saveLaber(laber);
    }

    @OuterResponseBody
    @PutMapping("/{id}")
    public void updateLaber(@PathVariable("id") Long id,@RequestBody Laber laber){
        laber.setId(id);
        laberService.updateLaber(laber);
    }

    @OuterResponseBody
    @PostMapping("/search")
    public List<Laber> findSearch(@RequestBody Map searchMap){
        List<Laber> list = laberService.findSearch(searchMap);
        if(list.isEmpty()){
            throw new MyExcepition(BaseException.NOT_FIND_LABER);
        }
        return list;
    }

    @ResponseBody
    @PostMapping("/search/{page}/{size}")
    public PageResult<Laber> findSearchByPage(@RequestBody Map searchMap, @PathVariable("page") Integer page,@PathVariable("size") Integer size) {
        PageRequest request = PageRequest.of(page - 1, size);
        Page<Laber> list = laberService.findSearchByPage(searchMap, request);
        if (list.isEmpty()) {
            throw new MyExcepition(BaseException.NOT_FIND_LABER);
        }
        return new PageResult<Laber>(list.getTotalElements(), list.getContent());
    }
}
