package com.travelportdigital.componentmanagementserver.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name="components", schema="components")
class Component {

  @Id
  @GeneratedValue
  Integer id

  String name
  String acronym

  @ManyToOne
  Team team

  String bitbucket
  String cacoo
  String confluence

}
