package com.clearn.logic;


import com.clearn.model.Employee;
import com.clearn.storage.EmployeeStorage;

import java.util.List;

public class EmployeeLogicImpl implements EmployeeLogic {

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
