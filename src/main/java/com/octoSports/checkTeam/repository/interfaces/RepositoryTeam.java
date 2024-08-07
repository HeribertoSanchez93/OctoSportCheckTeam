package com.octoSports.checkTeam.repository.interfaces;

import com.octoSports.checkTeam.model.TeamDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryTeam extends JpaRepository<TeamDto,Long> {
    TeamDto findByIdTeam(Long idTeam);
}
