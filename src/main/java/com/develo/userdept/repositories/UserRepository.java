package com.develo.userdept.repositories;

import com.develo.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
