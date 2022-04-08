package org.factoriaf5.katas.RentACar.repositories;


import org.factoriaf5.katas.RentACar.model.User;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id);

}
