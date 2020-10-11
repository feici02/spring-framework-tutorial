package com.clearn.logic;


import com.clearn.model.Employee;
import com.clearn.storage.EmployeeStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class EmployeeLogicImpl implements EmployeeLogic {

    @Autowired
    private EmployeeStorage employeeStorage;

    public EmployeeLogicImpl() {
    }

    public EmployeeLogicImpl(EmployeeStorage employeeStorage) {
        System.out.println("in constructor");
        this.employeeStorage = employeeStorage;
    }

    public EmployeeStorage getEmployeeStorage() {
        return employeeStorage;
    }

    public void setEmployeeStorage(EmployeeStorage employeeStorage) {
        System.out.println("in setter");
        this.employeeStorage = employeeStorage;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeStorage.getAllEmployees();
    }
}
