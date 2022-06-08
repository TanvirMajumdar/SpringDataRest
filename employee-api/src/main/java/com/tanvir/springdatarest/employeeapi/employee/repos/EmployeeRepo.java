package com.tanvir.springdatarest.employeeapi.employee.repos;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<com.tanvir.springdatarest.employeeapi.employee.entities.Employee, Long> {
}
