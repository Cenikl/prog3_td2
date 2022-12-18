package com.example.prog3_td2.controller;

import com.example.prog3_td2.controller.mapper.MatchRestMapper;
import com.example.prog3_td2.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MatchController {
    private final MatchService service;
    private final MatchRestMapper mapper;
}
