package com.dashboard.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import com.dashboard.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

    Team findByTeamName(String teamName);

}
