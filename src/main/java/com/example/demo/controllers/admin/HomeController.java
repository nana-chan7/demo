// 2023-09-01 2.week7 ?
// 2023-09-15 2.week9

package com.example.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("AdminHomeController") // ← Controller が重複してしまうので名前を付ける
@RequestMapping("/admin/")
public class HomeController {

    @GetMapping("")
    // @GetMapping(value="/admin/")
    public String index() {
        // template/admin/index.html がレンダリング
        return "admin/index";
    }

    @GetMapping("hello")
    public String hello(){
        // template/admin/index.html がレンダリング
        return "admin/index";
    }
}
