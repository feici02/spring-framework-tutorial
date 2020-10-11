package com.clearn.storage;

import com.clearn.model.Employee;

import java.util.List;

public interface EmployeeStorage {
    List<Employee> getAllEmployees();
}
