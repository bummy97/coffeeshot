package com.coffeeshot.bummy.domain.menu;

import com.coffeeshot.bummy.domain.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Long> {

    @Query(value = "SELECT p FROM Menu p WHERE p.list_idx = 1")
    List<Menu>findAllByListIdx();
}
