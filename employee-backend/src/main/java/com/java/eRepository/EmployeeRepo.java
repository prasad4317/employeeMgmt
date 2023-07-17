package com.java.eRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
