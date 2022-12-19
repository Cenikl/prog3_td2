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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "player")
    private List<PlayerEntity> player;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "sponsor")
    private List<SponsorEntity> sponsor;

}
