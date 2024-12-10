package com.neoteric.GroupByStreams;

import java.util.*;
import java.util.List;

public class AverageSalaryLegacyApproach {

    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();


        Employee employee1 = new Employee();
        employee1.setEmpId("kiran");
        employee1.setEmpId("1");
        employee1.setSalary(20000.0);
        employee1.setDept("ML");

        Employee employee2 = new Employee();
        employee2.setName("Divya");
        employee2.setEmpId("2");
        employee2.setSalary(18000.0);
        employee2.setDept("EEE");

        Employee employee3 = new Employee();
        employee3.setName("madhu");
        employee3.setEmpId("3");
        employee3.setSalary(1000.0);
        employee3.setDept("EEE");

        Employee employee4 = new Employee();
        employee4.setName("keerthi");
        employee4.setEmpId("4");
        employee4.setSalary(5000.0);
        employee4.setDept("EEE");

        Employee employee5 = new Employee();
        employee5.setName("teena");
        employee5.setEmpId("5");
        employee5.setSalary(2000.0);
        employee5.setDept("IT");

        Employee employee6 = new Employee();
        employee6.setName("rinki");
        employee6.setEmpId("6");
        employee6.setSalary(800.0);
        employee6.setDept("IT");

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);


//        Map<String, Double> deptaveragesalary = new HashMap<>();
//        Map<String, Integer> deptCountMap = new HashMap<>();
//
////        deptaveragesalary.put("AI",80000.0);
////
////        System.out.println(deptaveragesalary);
//
//        Iterator<Employee> employeeIterator = employeeList.iterator();
//
//        while (employeeIterator.hasNext()) {
//
//            Employee emp = employeeIterator.next();
//
//            if (deptaveragesalary.containsKey(emp.getDept())) {
//
//                Double d = deptaveragesalary.get(emp.getDept());
//                Double total = d + emp.getSalary();
//                deptaveragesalary.put(emp.getDept(), total);
//                int count = deptCountMap.get(emp.getDept());
//                int totalCount = count + 1;
//
//                deptCountMap.put(emp.getDept(), totalCount);
//
//
//            } else {
//
//                deptaveragesalary.put(emp.getDept(), emp.getSalary());
//                deptCountMap.put(emp.getDept(), 1);
//            }
//        }
//
//        System.out.println("total salary" + deptaveragesalary);
//
//        System.out.println("total count" + deptCountMap);
//
//        Iterator<String> deptIterator = deptaveragesalary.keySet().iterator();
//
//        while ((deptIterator.hasNext())) {
//            String dept = deptIterator.next();
//
//            Double totalSalary = deptaveragesalary.get(dept);
//            int totalCount = deptCountMap.get(dept);
//
//           System.out.println("Avg salary by dept" + totalSalary / totalCount);
//        }
//
//
//
//
//
//
//
//        Map<String, Double> deptLowestSalary = new HashMap<>();
//        Map<String, Integer> deptLowestCount = new HashMap<>();
//
//        Iterator<Employee> iterator = employeeList.iterator();
//
//        while (iterator.hasNext()) {
//
//            Employee employee = iterator.next();
//
//            if (deptLowestSalary.containsKey(employee.getDept())) {
//
//                Double dept = deptLowestSalary.get(employee.getDept());
//                Double overall = dept + employee.getSalary();
//
//                int count =deptLowestCount.get(employee.getDept());
//                int overallCount = count +1;
//
//                deptLowestCount.put(employee.getDept(),overallCount);
//
//
//            }else {
//
//                deptLowestSalary.put(employee.getDept(),employee.getSalary());
//                deptLowestCount.put(employee.getDept(), 1);
//            }
//        }
//
//        System.out.println("Total salary"+ deptLowestSalary);
//
//        System.out.println("Total count"+ deptLowestCount);
//
//        Iterator<String> lowestIterator = deptLowestSalary.keySet().iterator();
//
//        while (lowestIterator.hasNext()) {
//
//            String department = lowestIterator.next();
//
//            Double overallSalary = deptLowestSalary.get(department);
//
//            int overallCounts = deptLowestCount.get(department);
//
//            System.out.println("lowest salary by dept" + overallSalary/overallCounts);
//        }


        Map<String, Double> deptLowestSalary = new HashMap<>();
        Map<String,Double> deptHighestSalary = new HashMap<>();


        for (Employee employee : employeeList) {
            String department = employee.getDept();
            double salary = employee.getSalary();

            if (deptLowestSalary.containsKey(department)) {

                double currentLowest = deptLowestSalary.get(department);
                if (salary < currentLowest) {
                    deptLowestSalary.put(department, salary);
                }
            } else {

                deptLowestSalary.put(department, salary);
            }
        }


        System.out.println("Lowest salary by department: " + deptLowestSalary);


       // Map<String,Double> deptHighestSalary = new HashMap<>();

        for (Employee employee : employeeList) {
            String department = employee.getDept();
            double salary = employee.getSalary();

            if (deptHighestSalary.containsKey(department)){

                double currentHighest = deptHighestSalary.get(department);
                if (salary > currentHighest) {
                    deptHighestSalary.put(department,salary);
                }else {
                    deptHighestSalary.put(department,salary);
                }
            }

            System.out.println("Highest salary by department" + deptHighestSalary);
        }

    }


}