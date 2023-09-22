package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    // ※ staticフォルダ内の index.html より優先される   
    @GetMapping(value="/")
    // @ResponseBody // ← 追加することで正しく表示される
    public String index() {
        // return "Top Page!";
        // templates/home/sample.html をレンダリング
        return "home/sample";     
    }
}


// 授業 >>>
// @Controller は基本的にHTMLをレスポンスするため、
//  文字列を強制的にレスポンスするには@ResponseBody の定義が必要