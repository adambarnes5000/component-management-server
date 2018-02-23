package com.travelportdigital.componentmanagementserver.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="teams", schema="components")
class Team {

  @Id
  @GeneratedValue
  Integer id
  String name
  String lead

}
