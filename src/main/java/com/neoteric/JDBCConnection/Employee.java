package com.neoteric.JDBCConnection;

public class Employee {

    private int Empid;

    private String Name;

    private Double Salary;

    private String Dept;

    private int pid;

    private int pid2;

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPid2() {
        return pid2;
    }

    public void setPid2(int pid2) {
        this.pid2 = pid2;
    }
}
