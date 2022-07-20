package com.webapp.carsApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Integer> {

   @Override
    List<User> findAll();

   @Query(value = "SELECT user FROM User user WHERE user.e_mail = ?1")
    User findByEmail(String e_mail);

}
