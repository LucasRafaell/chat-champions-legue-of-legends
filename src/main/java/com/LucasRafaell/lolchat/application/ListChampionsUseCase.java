package com.LucasRafaell.lolchat.application;

import com.LucasRafaell.lolchat.domain.model.Champion;
import com.LucasRafaell.lolchat.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository repository) {

    public List<Champion> findAll(){
        return repository.findAll();
    }
}
