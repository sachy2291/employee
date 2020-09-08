package com.smarte.empservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smarte.empservice.eo.DepartmentEO;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEO, Long>{

}
