package com.clearn.logic;


import com.clearn.model.Employee;
import com.clearn.storage.EmployeeStorage;

import java.util.List;

public class EmployeeLogicImpl implements EmployeeLogic {

    private EmployeeStorage employeeStorage;

    public EmployeeStorage getEmployeeStorage() {
        return employeeStorage;
    }

    public void setEmployeeStorage(EmployeeStorage employeeStorage) {
        this.employeeStorage = employeeStorage;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeStorage.getAllEmployees();
    }
}
