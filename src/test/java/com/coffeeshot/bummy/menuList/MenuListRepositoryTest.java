package com.coffeeshot.bummy.menuList;

import com.coffeeshot.bummy.menu_list.Menu_list;
import com.coffeeshot.bummy.menu_list.Menu_listRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuListRepositoryTest {
    @Autowired
    Menu_listRepository menu_listRepository;

    @Test
    public void create(){
        Menu_list menu_list = new Menu_list();

        menu_list.setCafe_name("스타벅스");
        menu_list.setUser_num(6);
        menu_list.setMade_by("김용범");

        Menu_list newmenu_list = menu_listRepository.save(menu_list);
    }
}
