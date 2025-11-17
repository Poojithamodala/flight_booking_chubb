package com.flightapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.Entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {

}