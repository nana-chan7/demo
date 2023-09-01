package com.example.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller("AdminHomeController") // ← Controller が重複してしまうので名前を付ける
public class HomeController {
    @GetMapping(value="/admin/")
    public String index() {
        // template/admin/index.html がレンダリング
        return "admin/index";
    }
    
}
