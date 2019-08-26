package com.controller;


import com.service.TbArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class TbArticleController {

    @Autowired
    private TbArticleService tbArticleService;

    @GetMapping("examine")
    public void examine(@RequestParam Long id){
        tbArticleService.examine(id);
    }
    @GetMapping("updatethumpup")
    public void updateThumpup(@RequestParam Long id){
        tbArticleService.updateThumpup(id);
    }
}
