package com.example.prog3_td2.service;

import com.example.prog3_td2.model.TeamEntity;
import com.example.prog3_td2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository repository;

    public List<TeamEntity> getTeams() {
        return repository.findAll();
    }

    public List<TeamEntity> createTeams(List<TeamEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<TeamEntity> updateTeams(List<TeamEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }

    public ResponseEntity<TeamEntity> deleteTeam(Integer id) {
        Optional<TeamEntity> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return new ResponseEntity<>(optional.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
