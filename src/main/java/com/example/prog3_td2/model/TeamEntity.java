package com.example.prog3_td2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "team")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_team;
    private String name_team;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "player")
    @JoinColumn(name = "player_id", referencedColumnName = "id_player")
    private List<PlayerEntity> playerEntityList;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "sponsor")
    @JoinColumn(name = "sponsor_id", referencedColumnName = "id_sponsor")
    private List<SponsorEntity> sponsorEntityList;

    private int id_player;

    private int id_sponsor;
}
