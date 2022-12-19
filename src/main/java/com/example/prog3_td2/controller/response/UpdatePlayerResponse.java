package com.example.prog3_td2.controller.response;

import com.example.prog3_td2.model.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UpdatePlayerResponse {
    private String name_player;
    private int number_player;
    private TeamEntity player_team;
}
