package com.example.prog3_td2.controller.mapper;


import com.example.prog3_td2.controller.response.CreatePlayAgainstResponse;
import com.example.prog3_td2.controller.response.PlayAgainstResponse;
import com.example.prog3_td2.controller.response.UpdatePlayAgainstResponse;
import com.example.prog3_td2.model.PlayAgainstEntity;
import org.springframework.stereotype.Component;

@Component
public class PlayAgainstRestMapper {
    public PlayAgainstResponse toRest(PlayAgainstEntity domain) {
        return PlayAgainstResponse.builder()
                .team_home(domain.getTeam_home() == null ? domain.getTeam_home().getName_team() : null)
                .opponent(domain.getOpponent() == null ? domain.getOpponent().getName_team() : null)
                .datetime(domain.getDatetime())
                .build();
    }
    public PlayAgainstEntity toDomain(CreatePlayAgainstResponse rest) {
        return PlayAgainstEntity.builder()
                .team_home(rest.getTeam_home())
                .opponent(rest.getOpponent())
                .datetime(rest.getDatetime())
                .build();
    }

    public PlayAgainstEntity toDomain(UpdatePlayAgainstResponse rest) {
        return PlayAgainstEntity.builder()
                .team_home(rest.getTeam_home())
                .opponent(rest.getOpponent())
                .datetime(rest.getDatetime())
                .build();
    }
}
