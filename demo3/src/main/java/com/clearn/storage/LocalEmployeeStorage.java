package com.clearn.storage;

import com.clearn.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class LocalEmployeeStorage implements EmployeeStorage {
    @Override
    public List<Employee> getAllEmployees() {
        Employee emp1 = new Employee();
        emp1.setFirstName("Harry");
        emp1.setLastName("Potter");

        Employee emp2 = new Employee();
        emp2.setFirstName("Ron");
        emp2.setLastName("Weasley");

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);

        return employees;
    }
}
