package com.developer.empolyee_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developer.empolyee_management.entity.EmployeeEntity;

@Repository 
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    
}
 