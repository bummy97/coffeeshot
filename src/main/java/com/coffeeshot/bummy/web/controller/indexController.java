package com.coffeeshot.bummy.web.controller;

import com.coffeeshot.bummy.service.makeMenuService;
import com.coffeeshot.bummy.service.menuListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@RequiredArgsConstructor
@Controller
public class indexController {

    private final menuListService menu_listService;

    private final makeMenuService makeMenuService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/makelist")
    public String makelist(){
        return "makelist";
    }

    @GetMapping("/menulist")
    public String menulist(Model model){
        model.addAttribute("posts", menu_listService.findAllDesc());
        return "menulist";
    }

    @GetMapping("/makemenu")
    public String makeMenu(Model model){
        model.addAttribute("posts", makeMenuService.findAllByListIdx());
        return "makemenu";
    }
}
