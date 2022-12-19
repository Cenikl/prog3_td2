package com.example.prog3_td2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sponsor")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SponsorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sponsor;
    private String name_sponsor;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "sponsor_team",nullable = false)
    private List<TeamEntity> sponsor_team;
}
