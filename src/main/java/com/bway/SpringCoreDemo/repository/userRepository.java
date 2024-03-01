package com.bway.SpringCoreDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.SpringCoreDemo.model.User;

public interface userRepository extends JpaRepository<User, Integer> {
	
	
	
	
	User findByUsernameAndPassword(String un, String psw);

}
