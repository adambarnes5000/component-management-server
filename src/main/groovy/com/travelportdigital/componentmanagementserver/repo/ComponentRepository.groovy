package com.travelportdigital.componentmanagementserver.repo

import org.springframework.data.jpa.repository.JpaRepository

import com.travelportdigital.componentmanagementserver.model.Component

interface ComponentRepository extends JpaRepository<Component, Integer> {

}
