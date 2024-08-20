package com.java8.features.Streams;

import java.util.ArrayList;
import java.util.List;

public class ListOfEmployees {

    public static List<Employee> getListOfEmployees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice Johnson", "Engineering", 75000.00, "New York", "Software Engineer", "1234567890"));
        employees.add(new Employee(2, "Bob Smith", "Marketing", 68000.00, "Los Angeles", "Marketing Manager", "2345678901"));
        employees.add(new Employee(3, "Charlie Brown", "Sales", 70000.00, "Chicago", "Sales Executive", "3456789012"));
        employees.add(new Employee(4, "Diana Prince", "HR", 65000.00, "San Francisco", "HR Specialist", "4567890123"));
        employees.add(new Employee(5, "Eve Adams", "Finance", 72000.00, "New York", "Financial Analyst", "5678901234"));
        employees.add(new Employee(6, "Frank Castle", "Engineering", 78000.00, "Austin", "DevOps Engineer", "6789012345"));
        employees.add(new Employee(7, "Grace Lee", "Marketing", 69000.00, "Boston", "Digital Marketer", "7890123456"));
        employees.add(new Employee(8, "Hank Pym", "Sales", 71000.00, "San Francisco", "Sales Manager", "8901234567"));
        employees.add(new Employee(9, "Ivy Green", "HR", 66000.00, "Philadelphia", "Recruitment Specialist", "9012345678"));
        employees.add(new Employee(10, "John Doe", "Finance", 73000.00, "New York", "Financial Planner", "1023456789"));
    return employees;
    }
}
