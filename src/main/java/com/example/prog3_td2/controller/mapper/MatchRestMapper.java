package com.example.prog3_td2.controller.mapper;


import com.example.prog3_td2.controller.response.MatchResponse;
import com.example.prog3_td2.model.PlayAgainstEntity;
import org.springframework.stereotype.Component;

@Component
public class MatchRestMapper {
    public MatchResponse toRest(PlayAgainstEntity domain) {
        return MatchResponse.builder()
                .id_team_home(domain.getId_team_home())
                .id_team_other(domain.getId_team_other())
                .datetime(domain.getDatetime())
                .build();
    }
}
