package com.javatechnolessons.demo.controller;

import com.javatechnolessons.demo.model.Employee;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	List<Employee> findByPublished(boolean published);
	List<Employee> findByTitleContaining(String firstName);
	Optional<Employee> findByTitle(String firstName);
	


}

