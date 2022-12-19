package com.example.prog3_td2.controller.mapper;

import com.example.prog3_td2.controller.response.CreateTeamResponse;
import com.example.prog3_td2.controller.response.TeamResponse;
import com.example.prog3_td2.controller.response.UpdateTeamResponse;
import com.example.prog3_td2.model.TeamEntity;
import org.springframework.stereotype.Component;

@Component
public class TeamRestMapper {
    public TeamResponse toRest(TeamEntity domain) {
        return TeamResponse.builder()
                .id_team(domain.getId_team())
                .name_team(domain.getName_team())
                .player(domain.getPlayer())
                .sponsor(domain.getSponsor())
                .build();
    }
    public TeamEntity toDomain(CreateTeamResponse rest) {
        return TeamEntity.builder()
                .name_team(rest.getName_team())
                .build();
    }

    public TeamEntity toDomain(UpdateTeamResponse rest) {
        return TeamEntity.builder()
                .name_team(rest.getName_team())
                .player(rest.getPlayer())
                .sponsor(rest.getSponsor())
                .build();
    }
}
