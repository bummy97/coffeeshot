package com.coffeeshot.bummy.domain.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Long> {
    @Query(value = "SELECT p.idx, p.list_idx, p.coffee_name_1, p.coffee_name_2, p.user_name, p.create_by FROM Menu p WHERE p.list_idx = :idx")
    List<Menu>findAllByListIdx(@Param("idx") int idx);
}
