package com.example.saasbarber.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.saasbarber.entities.Administrator;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Long> {

}
