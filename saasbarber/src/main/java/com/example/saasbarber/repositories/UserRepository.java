package com.example.saasbarber.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.saasbarber.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
