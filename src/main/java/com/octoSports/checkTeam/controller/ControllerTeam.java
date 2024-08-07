package com.octoSports.checkTeam.controller;


import com.octoSports.checkTeam.model.ResponseModel;
import com.octoSports.checkTeam.model.TeamDto;
import com.octoSports.checkTeam.model.TeamsDto;
import com.octoSports.checkTeam.service.interfaces.IRepositoryTeam;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/teams")
public class ControllerTeam {
    private final IRepositoryTeam repositoryTeam;

    @GetMapping("/allTeams")
    public ResponseEntity<ResponseModel<TeamsDto>> allTeams(){
        return new ResponseEntity<>(ResponseModel.<TeamsDto>builder()
                .respuesta("Ok")
                .objeto(repositoryTeam.getTeams())
                .build(), HttpStatus.OK);
    }

    @GetMapping("/team/getById/{id}")
    public ResponseEntity<ResponseModel<TeamDto>> getTeamById(@PathVariable("id") Long id){
        return new ResponseEntity<>(ResponseModel.<TeamDto>builder()
                .respuesta("Ok")
                .objeto(repositoryTeam.getTeam(id))
                .build(), HttpStatus.OK);
    }
}
