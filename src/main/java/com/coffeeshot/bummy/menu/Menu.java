package com.coffeeshot.bummy.menu;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(nullable = false)
    private String UserName;

    private int menu_list;

    private String CoffeeName_1;

    private String CoffeeName_2;

    private String createBy;

    @Builder
    public Menu(String UserName, int menu_list, String CoffeeName_1, String CoffeeName_2, String createBy){
        this.UserName = UserName;
        this.menu_list = menu_list;
        this.CoffeeName_1 = CoffeeName_1;
        this.CoffeeName_2 = CoffeeName_2;
        this.createBy = createBy;
    }


}