package org.factoriaf5.katas.RentACarTest;
import org.factoriaf5.katas.RentACar.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
public class UserTest {


    @Test
    void userHaveAName() {

        User user = new User(0L, "Candy");
        assertThat(user.getName(), equalTo("Candy"));
    }

    @Test
    void userHaveAnId() {

        User user = new User(0L, "Candy");
        assertThat(user.getId(), equalTo(0L));
    }

}
