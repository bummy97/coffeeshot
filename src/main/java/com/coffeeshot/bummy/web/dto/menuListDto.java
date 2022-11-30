package com.coffeeshot.bummy.web.dto;

import com.coffeeshot.bummy.domain.menu_list.Menu_list;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class menuListDto {
    private String cafe_name;
    private int user_num;

    @Builder
    public menuListDto(String cafe_name, int user_num){
        this.cafe_name = cafe_name;
        this.user_num = user_num;
    }

    public Menu_list toEntity(){
        return Menu_list.builder()
                .cafe_name(cafe_name)
                .user_num(user_num)
                .made_by("김용범")
                .build();
    }
}
