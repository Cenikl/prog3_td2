package com.example.prog3_td2.controller;

import com.example.prog3_td2.controller.mapper.TeamRestMapper;
import com.example.prog3_td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TeamController {

    private final TeamService service;
    private final TeamRestMapper mapper;
}
