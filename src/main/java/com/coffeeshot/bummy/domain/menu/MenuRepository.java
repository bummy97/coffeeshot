package com.coffeeshot.bummy.domain.menu;

import com.coffeeshot.bummy.domain.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
}
