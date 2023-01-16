package com.coffeeshot.bummy.web.controller;

import com.coffeeshot.bummy.service.showMenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequiredArgsConstructor
public class showMenuController {
    private final showMenuService showMenuService;
    @RequestMapping(value= "/showMenu", method= RequestMethod.POST)
    public String showMenu(Model model, @RequestParam int idx){
        model.addAttribute("posts", showMenuService.findAllByListIdx(idx));
        return "showmenu";
    }
}

