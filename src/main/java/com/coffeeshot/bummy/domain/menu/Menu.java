package com.coffeeshot.bummy.domain.menu;

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
    private int idx;

    private int list_idx;

    @Column(nullable = false)
    private String user_name;

    private String coffee_name_1;

    private String coffee_name_2;

    private String create_by;

    @Builder
    public Menu(int list_idx, String user_name, String coffee_name_1, String coffee_name_2, String create_by){
        this.list_idx = list_idx;
        this.user_name = user_name;
        this.coffee_name_1 = coffee_name_1;
        this.coffee_name_2 = coffee_name_2;
        this.create_by = create_by;
    }
}
