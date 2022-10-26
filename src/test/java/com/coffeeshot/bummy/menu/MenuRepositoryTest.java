package com.coffeeshot.bummy.menu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MenuRepositoryTest {

    @Autowired
    MenuRepository menuRepository; //JPARepository 상속하기

    @Test
    public void create(){
        Menu menu = new Menu();

        menu.setUserName("김용범");
        menu.setMenu_list(1);
        menu.setCoffeeName_1("아이스 아메리카노");
        menu.setCoffeeName_2("콜드브루");
        menu.setCreateBy("김용범");

        Menu newmenu = menuRepository.save(menu); //다른 방법으로도 해보기

//        menuRepository.save(
//                Menu.builder()
//                        .UserName(testName)
//                        .menu_list(testMenuList)
//                        .CoffeeName_1(testCoffeeName_1)
//                        .CoffeeName_2(testCoffeeName_2)
//                        .createBy("test")
//                        .build());
//        //when
//        List<Menu> resultList = menuRepository.findAll();
//
//        //then
//        Menu result = resultList.get(0);
//        Assertions.assertThat(result.getUserName()).isEqualTo(testName);
    }

    @Test
    public void read(){
        Optional<Menu> menu = menuRepository.findById(3L);

        menu.ifPresent(
                selectMenu -> {
                    log.info(selectMenu.toString());
                }
        );
    }
}
