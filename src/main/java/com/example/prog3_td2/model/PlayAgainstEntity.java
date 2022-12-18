package com.example.prog3_td2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "play_against")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayAgainstEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_match;

    private int id_team_home;

    private int id_team_other;

    private LocalDate datetime;

    private String stadium;
}
