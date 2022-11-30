package com.coffeeshot.bummy.web.controller;

import com.coffeeshot.bummy.service.menuListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor// final 객체를 Constructor Injection 해줌(Autowired 역할)
public class makeListController {

    private final menuListService menu_listService;

    @PostMapping("/makelist/create")
    public String createList(@RequestParam String cafe_name, @RequestParam int user_num) throws Exception{
        menu_listService.save(cafe_name, user_num);
        return "makecomplete";
    }
}
