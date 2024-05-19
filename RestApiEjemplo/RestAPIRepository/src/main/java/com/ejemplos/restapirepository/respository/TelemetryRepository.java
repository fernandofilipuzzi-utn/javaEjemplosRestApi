package com.ejemplos.restapirepository.respository;

import org.springframework.data.repository.CrudRepository;

import com.ejemplos.restapirepository.models.Telemetry;


//https://docs.spring.io/spring-data/jpa/reference/repositories/custom-implementations.html

public interface TelemetryRepository extends CrudRepository<Telemetry, Integer> {

}
