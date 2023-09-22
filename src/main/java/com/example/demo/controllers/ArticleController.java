// 2023-09-15 2.week9
// 2023-09-22 3.week1

package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller("ArticleController")
public class ArticleController {

    @GetMapping(value="/article/")
    public String index() {
        return "article/index"; 
    }

    @GetMapping(value="/article/{id}")
    public String detail(@PathVariable("id") long id) {
        System.out.println(id);
        // templates/aritcle/detail.html を表示
        return "article/detail"; 
    }
    
}

