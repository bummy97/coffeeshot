package com.coffeeshot.bummy.controller;

import com.coffeeshot.bummy.menu_list.Menu_list;
import com.coffeeshot.bummy.menu_list.Menu_listRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor// final 객체를 Constructor Injection 해줌(Autowired 역할)
public class makeListController {

    private final Menu_listRepository menu_listRepository;

    @PostMapping("/makelist/create")
    public String createList(@RequestParam String cafe_name, @RequestParam String user_num) throws Exception{
        final Menu_list menu_list = Menu_list.builder()
                .cafe_name(cafe_name)
                .user_num(Integer.parseInt(user_num))
                .made_by("김용범")
                .build();

        menu_listRepository.save(menu_list);

        return "makecomplete";
    }
}
