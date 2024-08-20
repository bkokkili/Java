package com.java8.features.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<Employee> employees = ListOfEmployees.getListOfEmployees();
        employees.add(new Employee(11, "Alice Johnson", "Engineering", 75000.00, "New York", "Software Engineer", "1234567890"));
        employees.add(new Employee(12, "Bob Smith", "Marketing", 68000.00, "Los Angeles", "Marketing Manager", "2345678901"));

        //get list of employee names from all employee objects
        List<String> employeeNames = employees.stream().map(Employee::getName).collect(Collectors.toList());
        employeeNames.forEach(System.out::println);

        System.out.println("*********************************************");

        List<String> distinctEmployeeNames = employeeNames.stream().distinct().sorted().collect(Collectors.toList());

        distinctEmployeeNames.forEach(System.out::println);

        System.out.println("*********************************************");

        distinctEmployeeNames.forEach(employeeNames::remove);

        employeeNames.forEach(employeeName -> System.out.println("Duplicate Name "+employeeName));

        System.out.println("*********************************************");
    }
}
