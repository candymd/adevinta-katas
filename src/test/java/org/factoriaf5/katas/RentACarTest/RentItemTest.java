package org.factoriaf5.katas.RentACarTest;
import org.factoriaf5.katas.RentACar.model.Car;
import org.factoriaf5.katas.RentACar.model.RentItem;
import org.factoriaf5.katas.RentACar.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
public class RentItemTest {



    @Test
    void rentItemHasAnUser() {
        RentItem rentItem = new RentItem();
        User user = new User(1L, "Desi");
        rentItem.setUser(user);

        assertThat(rentItem.getUser(), equalTo(user));

    }

    @Test
    void rentItemHasACar() {
        RentItem rentItem = new RentItem();
        Car car = new Car(1L, "8247CKV", "Suzuki");
        rentItem.setCar(car);

        assertThat(rentItem.getCar(), equalTo(car));
    }

    @Test
    void rentItemHasAnId() {
        RentItem rentItem = new RentItem();
        rentItem.setId(1L);

        assertThat(rentItem.getId(), equalTo(1L));

    }

    @Test
    void rentItemHasADate() {
        RentItem rentItem = new RentItem();
        rentItem.setDate("April 5th, 2022");

        assertThat(rentItem.getDate(), equalTo("April 5th, 2022"));

    }


}
