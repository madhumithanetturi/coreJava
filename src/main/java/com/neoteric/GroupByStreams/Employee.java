package com.neoteric.GroupByStreams;

public class Employee {

    private String name;

    private String empId;

    private Double salary;

    private  String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    //    public Employee(String name, String empId, Double salary) {
//        this.name = name;
//        this.empId = empId;
//        this.salary = salary;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
