package com.example.html1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home {
    List<String> inputString = new ArrayList<>();
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/contact ")
    public String contact(){
        return "contact";
    }
    @PostMapping("/contact ")
    public String contact(@RequestParam String string){
        inputString.add(string);
        return "contact";
    }
    @GetMapping("/contactlist")
    public String contactList(Model model) {
        model.addAttribute("contactList", inputString);
        return "contactList";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }


}
