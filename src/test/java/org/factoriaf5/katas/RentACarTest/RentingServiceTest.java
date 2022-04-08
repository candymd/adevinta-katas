package org.factoriaf5.katas.RentACarTest;

import org.factoriaf5.katas.RentACar.model.Car;
import org.factoriaf5.katas.RentACar.model.RentItem;
import org.factoriaf5.katas.RentACar.model.User;
import org.factoriaf5.katas.RentACar.repositories.CarRepository;
import org.factoriaf5.katas.RentACar.repositories.RentItemRepository;
import org.factoriaf5.katas.RentACar.repositories.UserRepository;
import org.factoriaf5.katas.RentACar.service.RentingService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RentingServiceTest {

    @Mock
    UserRepository userRepository;
    @Mock
    CarRepository carRepository;
    @Mock
    RentItemRepository rentItemRepository;

    @Test
    void rentServicesReturnsANewRentItem() {
        Car car = new Car(); car.setId(1L);
        User user = new User(); user.setId(1L);
        RentItem rentItem = new RentItem();

        RentingService rentingService = new RentingService(rentItemRepository, userRepository, carRepository);
        Mockito.when(userRepository.findById(user.getId())).thenReturn(Optional.of(user));
        Mockito.when(carRepository.findById(car.getId())).thenReturn(Optional.of(car));
        Mockito.when(rentItemRepository.save(rentItem));

        var sut = rentingService.rentACar(user.getId(), car.getId());

        assertEquals(user.getId(), sut.getUser().getId());

    }


}
