package com.example.prog3_td2.controller.response;

import com.example.prog3_td2.model.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PlayAgainstResponse {
    private TeamEntity teamEntity;
    private int id_team_home;
    private int id_team_other;
    private LocalDate datetime;
}
