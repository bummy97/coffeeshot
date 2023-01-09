package com.coffeeshot.bummy.domain.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Long> {

    @Query(value = "SELECT p FROM Menu p WHERE p.list_idx = :idx")
    List<Menu>findAllByListIdx(@Param("idx") int idx);
}
