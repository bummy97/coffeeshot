package com.coffeeshot.bummy.web.dto;

import com.coffeeshot.bummy.domain.menu_list.Menu_list;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class menuListDto {
    private Long idx;
    private String cafe_name;
    private int user_num;
    private String made_by;

    public menuListDto(Menu_list entity){
        this.idx = entity.getIdx();
        this.cafe_name = entity.getCafe_name();
        this.user_num = entity.getUser_num();
        this.made_by = entity.getMade_by();
    }
}
