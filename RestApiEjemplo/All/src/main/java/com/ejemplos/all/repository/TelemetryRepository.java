package com.ejemplos.all.repository;

import org.springframework.data.repository.CrudRepository;

import com.ejemplos.restapi.models.Telemetry;

//https://docs.spring.io/spring-data/jpa/reference/repositories/custom-implementations.html

public interface TelemetryRepository extends CrudRepository<Telemetry, Integer> {

}
