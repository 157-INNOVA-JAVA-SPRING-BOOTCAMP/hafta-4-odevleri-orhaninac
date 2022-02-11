package com.PatikaDev.repository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ThymeleafController {

    @GetMapping("templates/signIn")
    public String getThymeleaf1(){
        return "formvalidation";
    }
}
