package com.clearn.storage;

import java.util.ArrayList;
import java.util.List;

import com.clearn.model.Employee;

public class LocalEmployeeStorage implements EmployeeStorage {

    private String cosmicobject;
    private String cosmicgalaxy;

    public String getCosmicobject() {
        return cosmicobject;
    }

    public void setCosmicobject(String cosmicobject) {
        this.cosmicobject = cosmicobject;
    }

    public String getCosmicgalaxy() {
        return cosmicgalaxy;
    }

    public void setCosmicgalaxy(String cosmicgalaxy) {
        this.cosmicgalaxy = cosmicgalaxy;
    }

    public List<Employee> getAllEmployees() {
        Employee emp1 = new Employee();
        emp1.setFirstName("Skanda");
        emp1.setLastName("Saberhagen@" +
                this.getCosmicobject() + "." +
                this.getCosmicgalaxy());

        Employee emp2 = new Employee();
        emp2.setFirstName("Shyam");
        emp2.setLastName("Dragonslayer@" +
                this.getCosmicobject() + "." +
                this.getCosmicgalaxy());

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);

        return employees;
    }
}