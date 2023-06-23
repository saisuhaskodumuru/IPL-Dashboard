package com.dashboard.ipldashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.ipldashboard.model.Team;
import com.dashboard.ipldashboard.repository.TeamRepository;

@RestController
public class TeamController {

    private TeamRepository teamRepository;

    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping("team/{teamName}")
    public Team getTeam(@PathVariable String teamName) {
        return this.teamRepository.findByTeamName(teamName);

    }

}