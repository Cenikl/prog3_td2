package com.example.prog3_td2.service;

import com.example.prog3_td2.model.SponsorEntity;
import com.example.prog3_td2.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SponsorService {
    private final SponsorRepository repository;

    public List<SponsorEntity> getAuthors() {
        return repository.findAll();
    }

    public List<SponsorEntity> createAuthors(List<SponsorEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<SponsorEntity> updateAuthors(List<SponsorEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }

    public ResponseEntity<SponsorEntity> deleteSponsor(Integer id) {
        Optional<SponsorEntity> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return new ResponseEntity<>(optional.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
