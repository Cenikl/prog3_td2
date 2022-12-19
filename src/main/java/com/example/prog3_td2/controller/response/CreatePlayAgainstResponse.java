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
public class CreatePlayAgainstResponse {
    private TeamEntity team_home;
    private TeamEntity opponent;
    private LocalDate datetime;
}
