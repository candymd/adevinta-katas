package org.factoriaf5.katas.RentACar.repositories;

import org.factoriaf5.katas.RentACar.model.Car;

import java.util.Optional;

public interface CarRepository {

    Optional<Car> findById(Long id);
}
