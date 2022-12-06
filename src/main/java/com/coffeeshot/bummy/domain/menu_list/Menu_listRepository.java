package com.coffeeshot.bummy.domain.menu_list;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Menu_listRepository extends JpaRepository<Menu_list, Long> {
    @Query("SELECT p FROM Menu_list p ORDER BY p.idx DESC ")
    List<Menu_list> findAllDesc();
}
