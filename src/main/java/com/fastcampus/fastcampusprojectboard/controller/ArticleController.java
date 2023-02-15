package com.fastcampus.fastcampusprojectboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/article")
@Controller
public class ArticleController {

    @GetMapping
    public String articles(ModelMap map){
        map.addAttribute("articles", List.of());

        return "articles/index";
    }

    @GetMapping({"/{articleId"})
    public String article(@PathVariable Long articleId, ModelMap map){
        map.addAttribute("article", null);
        map.addAttribute("articles", List.of());

        return "articles/index";
    }
}
