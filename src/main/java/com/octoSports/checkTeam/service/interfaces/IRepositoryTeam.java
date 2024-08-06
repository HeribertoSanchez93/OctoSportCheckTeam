package com.octoSports.checkTeam.service.interfaces;

import com.octoSports.checkTeam.model.TeamDto;
import com.octoSports.checkTeam.model.TeamsDto;

public interface IRepositoryTeam {
    TeamDto getTeam(Long id);
    TeamsDto getTeams();
}
