package com.java8.features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListIteration {

    public static void main(String[] args) {

        List<Employee> employeeList = ListOfEmployees.getListOfEmployees();
        //print all employees
        employeeList.forEach(System.out::println);

        System.out.println("************New york Location employees************");

        //print New york location employees
        employeeList.stream().filter(employee -> employee.getLocation().equalsIgnoreCase("New York"))
                .forEach(System.out::println);

        System.out.println("*************Highest salary employee***********");

        //print highest salary employee
        Optional<Employee> highestSalaryEmp = employeeList.stream().max((emp1, emp2)->Double.compare(emp1.getSalary(), emp2.getSalary()));

        highestSalaryEmp.ifPresent(System.out::println);

        System.out.println("*************Second Highest salary employee***********");
        //print Second Highest salary employee
        Optional<Employee> secondHighestEmp =  employeeList.stream().sorted((emp1, emp2) -> Double.compare(emp2.getSalary(), emp1.getSalary()))
                .skip(1) // Skip the highest salary
                .findFirst(); // Get the first element (second highest salary)
        secondHighestEmp.ifPresent(System.out::println);
    }
}

