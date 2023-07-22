package com.greatlearning.librarymgmtsec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatlearning.librarymgmtsec.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	@Query("select u from User u where u.name = ?1")
	public User findByName(String name);
}
