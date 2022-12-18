package com.example.prog3_td2.controller;

import com.example.prog3_td2.controller.mapper.PlayAgainstRestMapper;
import com.example.prog3_td2.controller.response.PlayAgainstResponse;
import com.example.prog3_td2.service.PlayAgainstService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayAgainstController {
    private final PlayAgainstService service;
    private final PlayAgainstRestMapper mapper;

    @GetMapping("/matches")
    public List<PlayAgainstResponse> getMatches() {
        return service.getMatchs().stream()
                .map(mapper::toRest)
                .toList();
    }
}