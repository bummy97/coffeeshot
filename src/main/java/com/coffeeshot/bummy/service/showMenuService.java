package com.coffeeshot.bummy.service;

import com.coffeeshot.bummy.domain.menu.Menu;
import com.coffeeshot.bummy.domain.menu.MenuRepository;
import com.coffeeshot.bummy.domain.menu.showMenuInterface;
import com.coffeeshot.bummy.web.dto.showMenuDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Slf4j
public class showMenuService {
    private final MenuRepository menuRepository;

    @Transactional
    public List<showMenuDto> findAllByListIdx(int idx){
        return menuRepository.findAllByListIdx(idx).stream().map(showMenuDto::new).collect(Collectors.toList());
    }

}
