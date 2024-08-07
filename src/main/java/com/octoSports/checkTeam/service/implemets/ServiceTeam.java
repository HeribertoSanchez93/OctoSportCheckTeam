package com.octoSports.checkTeam.service.implemets;

import com.google.gson.Gson;
import com.octoSports.checkTeam.model.TeamDto;
import com.octoSports.checkTeam.model.TeamsDto;
import com.octoSports.checkTeam.repository.interfaces.RepositoryTeam;
import com.octoSports.checkTeam.service.interfaces.IRepositoryTeam;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceTeam implements IRepositoryTeam {
    private final Gson gson;
    private final RepositoryTeam repositoryTeam;

    @Override
    public TeamDto getTeam(Long id) {
        return repositoryTeam.findByIdTeam(id);
    }

    @Override
    public TeamsDto getTeams() {
        return TeamsDto
                .builder()
                .teams(repositoryTeam.findAll())
                .build();
    }
}
