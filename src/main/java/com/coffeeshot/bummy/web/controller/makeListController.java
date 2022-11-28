package com.coffeeshot.bummy.web.controller;

import com.coffeeshot.bummy.domain.menu_list.Menu_list;
import com.coffeeshot.bummy.domain.menu_list.Menu_listRepository;
import com.coffeeshot.bummy.service.menuListService;
import com.coffeeshot.bummy.web.dto.menuListDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor// final 객체를 Constructor Injection 해줌(Autowired 역할)
public class makeListController {

    private final menuListService menu_listService;

    @PostMapping("/makelist/create")
    public String createList(@RequestParam String cafe_name, @RequestParam int user_num) throws Exception{
        System.out.println(cafe_name);

//        menu_listService.save(cafe_name, user_num);

//        final Menu_list menu_list = Menu_list.builder()
//                .cafe_name(cafe_name)
//                .user_num(Integer.parseInt(user_num))
//                .made_by("김용범")
//                .build();
//
//        menu_listRepository.save(menu_list);

        return "makecomplete";
    }
}
