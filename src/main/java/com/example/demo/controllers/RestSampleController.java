package com.example.demo.controllers;

// @re → @RestController → (↓ import...RestController が自動入力される)
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class RestSampleController {

    // me または get → GetMapping method で自動入力後、編集
    @GetMapping(value="/hello") // value= は省略可
    public String index() {
        return "Hello!!!";
    }
    
    // @GetMapping(value="/bye")
    // public String bye(@RequestParam String param) {
    //     String message = "Bye!" + param;
    //     return message;
    //     // http://localhost:8080/bye?param=○○○ ← byeの後に必ず ? と param(パラメータ)
    // }

    // ↓ パラメータを指定しなくてもページが開くようになる
    @GetMapping(value="/bye")
    public String bye(@RequestParam(name = "name", required = false)String param) {
        String message = "Bye!" + param;
        return message;
    }

    @GetMapping(value="/users/{userId}")
    public String getUser(@PathVariable Long userId) {
        String message = "User ID is" + userId;
        return message;
    }
    
}
