package com.example.prog3_td2.controller;

import com.example.prog3_td2.controller.mapper.PlayerRestMapper;
import com.example.prog3_td2.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService service;
    private final PlayerRestMapper mapper;
}
