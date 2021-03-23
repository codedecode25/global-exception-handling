package com.codedecode.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codedecode.demo.entity.Employee;

public interface EmployeeCrudRepo extends JpaRepository<Employee, Long> {
	
	

}
