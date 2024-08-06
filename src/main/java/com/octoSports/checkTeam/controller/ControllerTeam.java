package com.octoSports.checkTeam.controller;


import com.octoSports.checkTeam.model.TeamsDto;
import com.octoSports.checkTeam.service.interfaces.IRepositoryTeam;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/teams")
public class ControllerTeam {
    private final IRepositoryTeam repositoryTeam;

    @GetMapping("/allTeams")
    public ResponseEntity<TeamsDto> allTeams(){
        return new ResponseEntity<>(repositoryTeam.getTeams(), HttpStatus.OK);
    }
}
