package com.clearn;

import com.clearn.logic.EmployeeLogic;
import com.clearn.logic.EmployeeLogicImpl;
import com.clearn.storage.EmployeeStorage;
import com.clearn.storage.LocalEmployeeStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.clearn")
public class AppConfig {
    // @Bean(name = "employeeLogic")
    // public EmployeeLogic getEmployeeLogic()
    // {
    //     return new EmployeeLogicImpl();
    // }
    //
    // @Bean(name = "employeeStorage")
    // public EmployeeStorage getEmployeeStorage()
    // {
    //     return new LocalEmployeeStorage();
    // }
}
