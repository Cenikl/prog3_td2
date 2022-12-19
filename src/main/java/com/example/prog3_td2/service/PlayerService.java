package com.example.prog3_td2.service;

import com.example.prog3_td2.model.PlayerEntity;
import com.example.prog3_td2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository repository;

    public List<PlayerEntity> getPlayers() {
        return repository.findAll();
    }

    public List<PlayerEntity> createPlayers(List<PlayerEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<PlayerEntity> updatePlayers(List<PlayerEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }

    public ResponseEntity<PlayerEntity> deletePlayer(Integer id) {
        Optional<PlayerEntity> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return new ResponseEntity<>(optional.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}

