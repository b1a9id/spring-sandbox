package com.sandbox.spring.contoller;

import com.sandbox.spring.entity.Team;
import com.sandbox.spring.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;

	@GetMapping
	public List<Team> get() {
		return teamRepository.findAll();
	}
}
