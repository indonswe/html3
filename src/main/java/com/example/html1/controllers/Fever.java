package com.example.html1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Fever {

    String answer;
    String fix;

    @GetMapping("/fever")
    public String fever(){
        return "fever";
    }

    @PostMapping("/fever")
    public String fever(@RequestParam Double tem) {
        if (tem > 37.3){
            answer = "Fever";
        } else if (tem < 35.3) {
            answer = "Hypothermia";
        } else {
            answer = "Normal";
        }
        if (tem > 37.3){
            fix = "Icebath";
        } else if (tem < 35.3) {
            fix = "Sauna";
        } else {
            fix = "";
        }
        return "redirect:/answer";
        //return "fever";
    }
    @GetMapping("/answer")
    public String answer(Model model) {
        model.addAttribute("answer", answer);
        model.addAttribute("answer", fix);
        return "answer";
    }
}
