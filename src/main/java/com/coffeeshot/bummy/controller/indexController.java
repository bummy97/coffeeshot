package com.coffeeshot.bummy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("makelist")
    public String makelist(){
        return "makelist";
    }

    @GetMapping("menulist")
    public String menulist(){
        return "menulist";
    }
}
