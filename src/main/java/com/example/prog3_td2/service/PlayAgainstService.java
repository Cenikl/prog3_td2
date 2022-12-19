package com.example.prog3_td2.service;

import com.example.prog3_td2.model.PlayAgainstEntity;
import com.example.prog3_td2.repository.PlayAgainstRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayAgainstService {

    private final PlayAgainstRepository repository;

    public List<PlayAgainstEntity> getMatches() {
        return repository.findAll();
    }

    public List<PlayAgainstEntity> createMatches(List<PlayAgainstEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<PlayAgainstEntity> updateMatches(List<PlayAgainstEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }

    public ResponseEntity<PlayAgainstEntity> deleteMatch(Integer id) {
        Optional<PlayAgainstEntity> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return new ResponseEntity<>(optional.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
