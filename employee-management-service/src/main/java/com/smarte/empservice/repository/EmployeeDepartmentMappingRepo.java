package com.smarte.empservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smarte.empservice.eo.EmployeeDepartmentMappingEO;

@Repository
public interface EmployeeDepartmentMappingRepo extends JpaRepository<EmployeeDepartmentMappingEO, Long>{

}
