package com.blazingpotato.employeemanager.repo;

import com.blazingpotato.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
