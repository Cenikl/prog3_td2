package com.example.prog3_td2.controller;

import com.example.prog3_td2.controller.mapper.PlayerRestMapper;
import com.example.prog3_td2.controller.response.CreatePlayerResponse;
import com.example.prog3_td2.controller.response.PlayerResponse;
import com.example.prog3_td2.controller.response.UpdatePlayerResponse;
import com.example.prog3_td2.model.PlayerEntity;
import com.example.prog3_td2.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService service;
    private final PlayerRestMapper mapper;

    @GetMapping("/players")
    public List<PlayerResponse> getPlayers() {
        return service.getPlayers().stream()
                .map(mapper::toRest)
                .toList();
    }

    @PostMapping("/players")
    public List<PlayerResponse> createPlayers(@RequestBody List<CreatePlayerResponse> toCreate) {
        List<PlayerEntity> domain = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.createPlayers(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/players")
    public List<PlayerResponse> updatePlayers(@RequestBody List<UpdatePlayerResponse> toUpdate) {
        List<PlayerEntity> domain = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.updatePlayers(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @DeleteMapping("/players/{playerId}")
    public ResponseEntity<PlayerEntity> deletePlayer(@PathVariable int playerId) {
        return service.deletePlayer(playerId);
    }
}
