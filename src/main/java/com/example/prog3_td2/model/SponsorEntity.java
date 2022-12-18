package com.example.prog3_td2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @Column(nullable = false)
    private int id_team;
}
