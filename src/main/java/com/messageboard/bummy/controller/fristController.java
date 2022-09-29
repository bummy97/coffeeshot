package com.messageboard.bummy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fristController {
    @GetMapping("/frist")
    public String frist(){
        return "welcome";
    }
}
