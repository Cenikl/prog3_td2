package com.example.prog3_td2.service;

import com.example.prog3_td2.model.PlayerEntity;
import com.example.prog3_td2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository repository;

    public List<PlayerEntity> getPlayers() {
        return repository.findAll();
    }

}

