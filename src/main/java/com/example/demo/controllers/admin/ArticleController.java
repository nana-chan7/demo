// 2023-09-22 3.week1

package com.example.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("AdminArticleController")
@RequestMapping("/admin/article/")
public class ArticleController {
    
    @GetMapping("")
    public String index() {
        return "admin/article/index";
    }
    
}
