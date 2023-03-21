package com.base.knockknock.repository;

import com.base.knockknock.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByName (String name);
}
