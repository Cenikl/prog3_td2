package com.example.prog3_td2.controller;

import com.example.prog3_td2.controller.mapper.TeamRestMapper;
import com.example.prog3_td2.controller.response.CreateTeamResponse;
import com.example.prog3_td2.controller.response.TeamResponse;
import com.example.prog3_td2.controller.response.UpdateTeamResponse;
import com.example.prog3_td2.model.TeamEntity;
import com.example.prog3_td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;
    private final TeamRestMapper mapper;

    @GetMapping("/teams")
    public List<TeamResponse> getTeams() {
        return service.getTeams().stream()
                .map(mapper::toRest)
                .toList();
    }

    @PostMapping("/teams")
    public List<TeamResponse> createTeams(@RequestBody List<CreateTeamResponse> toCreate) {
        List<TeamEntity> domain = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.createTeams(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/teams")
    public List<TeamResponse> updateTeams(@RequestBody List<UpdateTeamResponse> toUpdate) {
        List<TeamEntity> domain = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.updateTeams(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @DeleteMapping("/teams/{teamId}")
    public ResponseEntity<TeamEntity> deleteTeam(@PathVariable int teamId) {
        return service.deleteTeam(teamId);
    }
}
