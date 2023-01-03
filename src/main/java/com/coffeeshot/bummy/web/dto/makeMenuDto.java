package com.coffeeshot.bummy.web.dto;

import com.coffeeshot.bummy.domain.menu.Menu;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class makeMenuDto {
    private int idx;
    private int list_idx;
    private String user_name;
    private String coffee_name_1;
    private String coffee_name_2;
    private String create_by;

    public makeMenuDto(Menu entity){
        this.idx = entity.getIdx();
        this.list_idx = entity.getList_idx();
        this.user_name = entity.getUser_name();
        this.coffee_name_1 = entity.getCoffee_name_1();
        this.coffee_name_2 = entity.getCoffee_name_2();
        this.create_by = entity.getCreate_by();
    }

}
