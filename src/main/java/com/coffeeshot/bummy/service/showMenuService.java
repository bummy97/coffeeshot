package com.coffeeshot.bummy.service;

import com.coffeeshot.bummy.domain.menu.MenuRepository;
import com.coffeeshot.bummy.web.dto.makeMenuDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class showMenuService {
    private final MenuRepository menuRepository;

    @Transactional
    public List<makeMenuDto> findAllByListIdx(){
        return menuRepository.findAllByListIdx().stream().map(makeMenuDto::new).collect(Collectors.toList());
    }

}
