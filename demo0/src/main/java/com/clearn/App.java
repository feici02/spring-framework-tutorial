package com.clearn;

import com.clearn.logic.EmployeeLogicImpl;
import com.clearn.logic.EmployeeLogic;
import com.clearn.model.Employee;

import java.util.List;

public class App {
    public static void main(String[] args) {
        EmployeeLogic employeeLogic = new EmployeeLogicImpl();

        List<Employee> allEmployees = employeeLogic.getAllEmployees();
        allEmployees.forEach(System.out::println);
    }
}
