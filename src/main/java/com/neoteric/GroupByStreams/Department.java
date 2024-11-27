package com.neoteric.GroupByStreams;

import java.util.List;

public class Department {

private List<Employee> employees;

private String deptName;

    public Department(List<Employee> employees, String deptName) {
        this.employees = employees;
        this.deptName = deptName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getDeptName() {
        return deptName;
    }
}
