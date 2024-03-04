package com.bway.SpringCoreDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bway.SpringCoreDemo.model.User;

@Repository
public interface userRepository extends JpaRepository<User, Integer> {
    User findByUsernameAndPassword(String username, String password);
}
