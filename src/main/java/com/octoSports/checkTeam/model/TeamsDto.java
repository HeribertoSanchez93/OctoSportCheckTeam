package com.octoSports.checkTeam.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class TeamsDto {
    @SerializedName("teams")
    private List<TeamDto> teams;
}
