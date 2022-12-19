package com.example.prog3_td2.controller.response;

import com.example.prog3_td2.model.PlayerEntity;
import com.example.prog3_td2.model.SponsorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UpdateTeamResponse {
    private String name_team;
    private List<PlayerEntity> player;
    private List<SponsorEntity> sponsor;
}
