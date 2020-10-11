package com.clearn.storage;

import java.util.ArrayList;

import java.util.List;

import com.clearn.model.Employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("employeeStorage")
public class LocalEmployeeStorage implements EmployeeStorage {
    @Value("${cosmicobject}")
    private String cosmicobject;

    @Value("${cosmicgalaxy}")
    private String cosmicgalaxy;

    public List<Employee> getAllEmployees() {
        Employee emp1 = new Employee();
        emp1.setFirstName("Skanda");
        emp1.setLastName("Saberhagen@" +
                this.cosmicobject + "." +
                this.cosmicgalaxy);

        Employee emp2 = new Employee();
        emp2.setFirstName("Shyam");
        emp2.setLastName("Dragonslayer@" +
                this.cosmicobject + "." +
                this.cosmicgalaxy);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);

        return employees;
    }
}