package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.EmployeeType;
@Repository

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}