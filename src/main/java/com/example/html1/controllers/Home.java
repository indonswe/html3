package com.example.html1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {
    @GetMapping("/index")
    public String index(){
        return null;
    }
    @GetMapping("/contact ")
    public String contact(){
        return null;
    }
    @PostMapping("/contact ")
    public String contact(@RequestParam String string){
        return string;
    }
}
