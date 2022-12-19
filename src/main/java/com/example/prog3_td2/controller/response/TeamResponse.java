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
public class TeamResponse {
    private List<PlayerEntity> playerEntityList;
    private List<SponsorEntity> sponsorEntityList;
    private int id_player;
    private int id_sponsor;
}
