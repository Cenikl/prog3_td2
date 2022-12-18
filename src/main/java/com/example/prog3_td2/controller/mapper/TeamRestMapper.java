package com.example.prog3_td2.controller.mapper;

import com.example.prog3_td2.controller.response.TeamResponse;
import com.example.prog3_td2.model.TeamEntity;
import org.springframework.stereotype.Component;

@Component
public class TeamRestMapper {
    public TeamResponse toRest(TeamEntity domain) {
        return TeamResponse.builder()
                .id_player(domain.getId_player())
                .id_sponsor(domain.getId_sponsor())
                .build();
    }
}
