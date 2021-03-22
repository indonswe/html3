package com.example.html1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/index")
    public String index(){
        return null;
    }
    @GetMapping("/contact ")
    public String contact(String string){
        return string;
    }
}
