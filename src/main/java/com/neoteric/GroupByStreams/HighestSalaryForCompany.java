package com.neoteric.GroupByStreams;

import java.util.*;

public class HighestSalaryForCompany {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setEmpId("madhu");
        employee1.setEmpId("1");
        employee1.setSalary(200000.0);
        employee1.setDept("AI");

        Employee employee2 = new Employee();
        employee2.setEmpId("keerthi");
        employee2.setEmpId("2");
        employee2.setSalary(20000.0);
        employee2.setDept("ML");

        Employee employee3 = new Employee();
        employee3.setEmpId("vaishu");
        employee3.setEmpId("3");
        employee3.setSalary(15000.0);
        employee3.setDept("AI");

        Employee employee4 = new Employee();
        employee4.setEmpId("yashu");
        employee4.setEmpId("4");
        employee4.setSalary(5000.0);
        employee4.setDept("ML");

        Employee employee5 = new Employee();
        employee5.setEmpId("teena");
        employee5.setEmpId("5");
        employee5.setSalary(50000.0);
        employee5.setDept("AI");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);


        Map<String, Double> deptHighestSalary = new HashMap<>();
        Iterator<Employee> employeeIterator = employees.iterator();

        while (employeeIterator.hasNext()) {

            Employee employee = employeeIterator.next();
            String department = employee.getDept();
            double salary = employee.getSalary();

            if (deptHighestSalary.containsKey(department)) {
                double currentSalary = deptHighestSalary.get(department);
                deptHighestSalary.put(department, Math.max(currentSalary, salary));

            } else {
                deptHighestSalary.put(department, salary);
            }
        }

        Iterator<Map.Entry<String, Double>> iterator = deptHighestSalary.entrySet().iterator();

        System.out.println(" Highest salary: ");

        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            System.out.println(" Department: " + entry.getKey() + ", Highest Salary: " + entry.getValue());

        }

        Map<String, Double> deptlowestSalary = new HashMap<>();
        Iterator<Employee> employerIterator = employees.iterator();

        while (employerIterator.hasNext()) {

            Employee emp = employerIterator.next();
            String deptEmployee = emp.getDept();
            double salarys = emp.getSalary();

            if (deptlowestSalary.containsKey(deptEmployee)) {
                double currentLowSalary = deptlowestSalary.get(deptEmployee);

                deptlowestSalary.put(deptEmployee, Math.min(currentLowSalary, salarys));


            } else {
                deptlowestSalary.put(deptEmployee, salarys);
            }

        }

        Iterator<Map.Entry<String, Double>> entryIterator = deptlowestSalary.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Double> doubleEntry = entryIterator.next();
            System.out.println("Department: " + doubleEntry.getKey() + ", Lowest Salary: " + doubleEntry.getValue());
        }
    }
}
