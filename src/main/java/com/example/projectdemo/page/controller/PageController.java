package com.example.projectdemo.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("/loginPage")
    public String loginPage(){
        return "index";
    }

    @GetMapping("/signupPage")
    public String signupPage(){
        return "signupPage";
    }
}
