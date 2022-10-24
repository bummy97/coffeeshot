package com.coffeeshot.bummy.menu;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MenuRepositoryTest {

    @Autowired
    MenuRepository menuRepository;

//    @After
//    public void cleanup(){
//        menuRepository.deleteAll();
//    }

    @Test
    public void create(){
        //given
        final String testName = "김용범";
        final String testCoffeeName_1 = "아이스아메리카노";
        final String testCoffeeName_2 = "카페 라떼";

        menuRepository.save(
                Menu.builder()
                        .UserName(testName)
                        .CoffeeName_1(testCoffeeName_1)
                        .CoffeeName_2(testCoffeeName_2)
                        .createBy("test")
                        .build());
        //when
        List<Menu> resultList = menuRepository.findAll();

        //then
        Menu result = resultList.get(0);
        Assertions.assertThat(result.getUserName()).isEqualTo(testName);

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
