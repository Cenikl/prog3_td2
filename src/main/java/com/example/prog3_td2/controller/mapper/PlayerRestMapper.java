package com.example.prog3_td2.controller.mapper;

import com.example.prog3_td2.controller.response.CreatePlayerResponse;
import com.example.prog3_td2.controller.response.PlayerResponse;
import com.example.prog3_td2.controller.response.UpdatePlayerResponse;
import com.example.prog3_td2.model.PlayerEntity;
import org.springframework.stereotype.Component;

@Component
public class PlayerRestMapper {
    public PlayerResponse toRest(PlayerEntity domain) {
        return PlayerResponse.builder()
                .id_player(domain.getId_player())
                .name_player(domain.getName_player())
                .build();
    }
    public PlayerEntity toDomain(CreatePlayerResponse rest) {
        return PlayerEntity.builder()
                .name_player(rest.getName_player())
                .number_player(rest.getNumber_player())
                .player_team(rest.getPlayer_team())
                .build();
    }

    public PlayerEntity toDomain(UpdatePlayerResponse rest) {
        return PlayerEntity.builder()
                .name_player(rest.getName_player())
                .number_player(rest.getNumber_player())
                .player_team(rest.getPlayer_team())
                .build();
    }
}
