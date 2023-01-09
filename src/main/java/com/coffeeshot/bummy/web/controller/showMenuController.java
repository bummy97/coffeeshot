package com.coffeeshot.bummy.web.controller;

import com.coffeeshot.bummy.service.showMenuService;
import com.coffeeshot.bummy.web.dto.makeMenuDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.stream.Collectors;

@Controller
@Slf4j
@RequiredArgsConstructor
public class showMenuController {
    private final showMenuService showMenuService;

    @ResponseBody
    @PostMapping("/showMenu")
    public String showMenu(Model model, @RequestParam int idx){
        model.addAttribute("posts", showMenuService.findAllByListIdx(idx));
        return "showmenu";
    }
}

