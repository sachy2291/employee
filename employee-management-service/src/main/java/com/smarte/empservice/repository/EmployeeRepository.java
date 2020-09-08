package com.smarte.empservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smarte.empservice.eo.EmployeeEO;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEO, Long>{

}
