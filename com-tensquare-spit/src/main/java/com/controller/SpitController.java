package com.controller;

import com.pojo.Spit;
import com.service.SpitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("spit")
public class SpitController {

    @Autowired
    private SpitService spitService;

    @GetMapping
    public List<Spit> querySpitAll(){
        return spitService.querySpitAll();
    }

    @GetMapping("{id}")
    public Spit querySpitById(@PathVariable String id){
        return spitService.querySpitById(id);
    }

    @PostMapping
    public void saveSpit(Spit spit){
        spitService.saveSpit(spit);
    }

    @DeleteMapping("/{id}")
    public void deleteSpit(@PathVariable String id){
        spitService.deleteSpit(id);
    }

    @PutMapping
    public void updateSpit(Spit spit){
        spitService.updateSpit(spit);
    }

}
