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
        return null;
    }
    @GetMapping("/contact ")
    public String contact(){
        return null;
    }
    @PostMapping("/contact ")
    public String contact(@RequestParam String string){
        inputString.add(string);
        return string;
    }
    @GetMapping("/contactlist")
    public String contactList(Model model) {
        model.addAttribute(inputString);
        return "contactlist";
    }


}
