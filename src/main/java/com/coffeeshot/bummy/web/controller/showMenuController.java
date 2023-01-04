package com.coffeeshot.bummy.web.controller;

import com.coffeeshot.bummy.service.makeMenuService;
import com.coffeeshot.bummy.service.showMenuService;
import com.coffeeshot.bummy.web.dto.makeMenuDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class showMenuController {
    private final showMenuService showMenuService;

    @GetMapping("/showMenu")
    public String showMenu(Model model){
        model.addAttribute("posts", showMenuService.findAllByListIdx());
        return "showmenu";
    }
}

