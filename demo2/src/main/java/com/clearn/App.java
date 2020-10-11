package com.clearn;

import com.clearn.logic.EmployeeLogic;
import com.clearn.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeLogic employeeLogic = applicationContext.getBean("employeeLogic", EmployeeLogic.class);

        List<Employee> allEmployees = employeeLogic.getAllEmployees();
        allEmployees.forEach(System.out::println);
    }
}
