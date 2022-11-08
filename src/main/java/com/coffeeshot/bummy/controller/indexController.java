package com.coffeeshot.bummy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

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

//    @GetMapping("make_list")
//    @ResponseBody
//    public void make_list(HttpServletResponse response, @RequestParam String cafe_name, @RequestParam String user_num) throws Exception{
//        Map<String, Object> data = new HashMap<String, Object>();
//
//        data.put("cafeName", cafe_name);
//        data.put("userNumber", user_num);
//        data.put("success", "success");
//    }

    @PostMapping("/makelist/create")
    public String createList(@RequestParam String cafe_name, @RequestParam String user_num) throws Exception{
        System.out.println(cafe_name);
        return "index";
    }

}
