package com.clearn.logic;

import com.clearn.model.Employee;
import com.clearn.storage.EmployeeStorage;
import com.clearn.storage.LocalEmployeeStorage;

import java.util.List;

public class EmployeeLogicImpl implements EmployeeLogic {
    private EmployeeStorage employeeStorage = new LocalEmployeeStorage();

    @Override
    public List<Employee> getAllEmployees() {
        return employeeStorage.getAllEmployees();
    }
}
