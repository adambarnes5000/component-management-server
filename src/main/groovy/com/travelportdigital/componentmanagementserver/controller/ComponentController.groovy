package com.travelportdigital.componentmanagementserver.controller

import static org.springframework.web.bind.annotation.RequestMethod.GET
import static org.springframework.web.bind.annotation.RequestMethod.POST

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

import com.travelportdigital.componentmanagementserver.model.Component
import com.travelportdigital.componentmanagementserver.repo.ComponentRepository
//@RestController
//@RequestMapping("/components")
class ComponentController {

  @Autowired ComponentRepository repository

  @RequestMapping(method = POST)
  Component create(@RequestBody Component component){
    repository.save(component)
  }

  @RequestMapping(method = GET)
  Iterable<Component> getAll(){
    repository.findAll()
  }


}
