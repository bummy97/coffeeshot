package com.coffeeshot.bummy.service;

import com.coffeeshot.bummy.domain.menu_list.Menu_list;
import com.coffeeshot.bummy.domain.menu_list.Menu_listRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class menuListService {
    private final Menu_listRepository menuListRepository;

    @Transactional
    public Menu_list save(String cafe_name, int user_num){
        Menu_list menu_list = new Menu_list();

        menu_list.setCafe_name(cafe_name);
        menu_list.setUser_num(user_num);
        menu_list.setMade_by("김용범");

        return menuListRepository.save(menu_list);
    }
}
