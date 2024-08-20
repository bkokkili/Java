package com.java8.features.Streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {

        List<Employee> employees = ListOfEmployees.getListOfEmployees();

        //Employee::getEmpid is a method reference that specifies the key for the map.
        //Function.identity() is a function that returns the employee object itself as the value in the map.
        Map<Integer, Employee> employeeMap = employees.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));


        employeeMap.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));

    }
}
