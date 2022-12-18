package com.example.prog3_td2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "player")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_player;
    private String name_player;
    private int number_player;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_team",referencedColumnName = "id_team")
    private TeamEntity teamEntity;

    @Column(nullable = false)
    private int id_team;
}
