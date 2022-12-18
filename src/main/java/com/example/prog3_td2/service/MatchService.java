package com.example.prog3_td2.service;

import com.example.prog3_td2.model.MatchEntity;
import com.example.prog3_td2.repository.MatchRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MatchService {

    private final MatchRepository repository;

    public List<MatchEntity> getMatchs() {
        return repository.findAll();
    }

    public List<MatchEntity> createMatchs(List<MatchEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<MatchEntity> updateMatchs(List<MatchEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }

    public ResponseEntity<MatchEntity> deleteMatch(Integer id) {
        Optional<MatchEntity> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return new ResponseEntity<>(optional.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
