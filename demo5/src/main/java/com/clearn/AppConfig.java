package com.clearn;

import com.clearn.logic.EmployeeLogic;
import com.clearn.logic.EmployeeLogicImpl;
import com.clearn.storage.EmployeeStorage;
import com.clearn.storage.LocalEmployeeStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "employeeLogic")
    public EmployeeLogic getEmployeeLogic()
    {
        // setter injection
        EmployeeLogicImpl logic = new EmployeeLogicImpl();
        logic.setEmployeeStorage(this.getEmployeeStorage());

        // constructor injection
        // EmployeeLogicImpl logic = new EmployeeLogicImpl(this.getEmployeeStorage());

        return logic;
    }

    @Bean(name = "employeeStorage")
    public EmployeeStorage getEmployeeStorage()
    {
        return new LocalEmployeeStorage();
    }
}
