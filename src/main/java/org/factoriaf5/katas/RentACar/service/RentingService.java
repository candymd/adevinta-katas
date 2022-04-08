package org.factoriaf5.katas.RentACar.service;

import org.factoriaf5.katas.RentACar.model.Car;
import org.factoriaf5.katas.RentACar.model.RentItem;
import org.factoriaf5.katas.RentACar.model.User;
import org.factoriaf5.katas.RentACar.repositories.CarRepository;
import org.factoriaf5.katas.RentACar.repositories.RentItemRepository;
import org.factoriaf5.katas.RentACar.repositories.UserRepository;

public class RentingService {

    private RentItemRepository rentItemRepository;
    private UserRepository userRepository;
    private CarRepository carRepository;

    public RentingService(RentItemRepository rentItemRepository, UserRepository userRepository, CarRepository carRepository) {
        this.rentItemRepository = rentItemRepository;
        this.userRepository = userRepository;
        this.carRepository = carRepository;
    }

    public RentItem rentACar(Long userID, Long CarID) {
       return new RentItem(1L, "today", new User(1L, "Carlos"), new Car());
    }

}
