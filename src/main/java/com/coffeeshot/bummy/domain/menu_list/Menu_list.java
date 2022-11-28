package com.coffeeshot.bummy.domain.menu_list;

import lombok.*;

import javax.persistence.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Menu_list {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(nullable = false)
    private String cafe_name;

    private int user_num;

    private String made_by;

    @Builder
    public Menu_list(String cafe_name, int user_num, String made_by){
        this.cafe_name = cafe_name;
        this.user_num = user_num;
        this.made_by = made_by;
    }
}
