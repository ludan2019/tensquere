package com.controller;

import com.outresult.OuterResponseBody;
import com.outresult.ResponseBodyWrapFactoryBean;
import com.pojo.Laber;
import com.server.LaberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

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
}
