package com.it15301.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.it15301.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

	User findByEmail(String email);
}
