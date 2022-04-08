package org.factoriaf5.katas.RentACarTest;

import org.factoriaf5.katas.RentACar.model.Car;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
public class CarTest {

    @Test
    void carHasAnId() {
        Car car = new Car(0L, "8247CKV", "Suzuki");

        assertThat(car.getId(), equalTo(0L));

    }
    @Test
    void carHasABrand() {
        Car car = new Car();
        car.setBrand("Suzuki");

        assertThat(car.getBrand(), equalTo("Suzuki"));

    }

    @Test
    void carHasAPlateNumber() {
        Car car = new Car();
        car.setPlateNumber("8247CKV");

        assertThat(car.getPlateNumber(), equalTo("8247CKV"));

    }
}
