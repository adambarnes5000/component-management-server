package com.travelportdigital.componentmanagementserver.controller

import static org.springframework.web.bind.annotation.RequestMethod.GET
import static org.springframework.web.bind.annotation.RequestMethod.POST

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

import com.travelportdigital.componentmanagementserver.model.Team
import com.travelportdigital.componentmanagementserver.repo.TeamRepository
//@RestController
//@RequestMapping("/teams")
class TeamController {

  @Autowired TeamRepository repository

  @RequestMapping(method = POST)
  Team create(@RequestBody Team team){
    repository.save(team)
  }

  @RequestMapping(method = GET)
  Iterable<Team> getAll(){
    repository.findAll()
  }


}
