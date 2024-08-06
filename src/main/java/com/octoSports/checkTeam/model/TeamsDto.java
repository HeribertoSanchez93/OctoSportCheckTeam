package com.octoSports.checkTeam.model;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TeamsDto {
    @SerializedName("teams")
    private List<TeamDto> teams;
}
