package com.travelportdigital.componentmanagementserver.repo

import org.springframework.data.jpa.repository.JpaRepository

import com.travelportdigital.componentmanagementserver.model.Team

interface TeamRepository extends JpaRepository<Team, Integer> {

}
