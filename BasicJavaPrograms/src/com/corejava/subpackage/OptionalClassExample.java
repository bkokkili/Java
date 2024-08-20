package com.corejava.subpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {

	public Employee(int id, String empName, Long empPhone, int salary, String city) {
		super();
		this.id = id;
		this.empName = empName;
		this.empPhone = empPhone;
		this.salary = salary;
		this.city = city;
	}

	private int id;
	private String empName;
	private Long empPhone;
	private int salary;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(Long empPhone) {
		this.empPhone = empPhone;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

public class OptionalClassExample {

	public static void main(String[] args) {

		Employee employee1 = null;

		Optional<Employee> optionalValue = Optional.ofNullable(employee1);

		if (optionalValue.isPresent()) {
			System.out.println("Not null");
		} else {
			System.out.println("NullPointerException");
		}

		Employee employee2 = new Employee(120, "Balaji", 8801021900L, 40000, "Chennai");
		Employee employee3 = new Employee(130, "Raj", 8801021901L, 50000, "Hyderabad");
		Employee employee4 = new Employee(140, "Kumar", 8801021902L, 60000, "Banglore");
		Employee employee5 = new Employee(150, "Sampath", 8801021900L, 40000, "Chennai");
		Employee employee6 = new Employee(160, "Dan", 8801021901L, 20000, "Delhi");
		Employee employee7 = new Employee(170, "Rand", 8801021902L, 90000, "Mumbai");
		Employee employee8 = new Employee(180, "Daniel", 8801021900L, 14000, "Chennai");
		Employee employee9 = new Employee(190, "Krish", 8801021901L, 5000, "Vizag");
		Employee employee10 = new Employee(200, "Chandra", 8801021902L, 650000, "kochin");
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		employeeList.add(employee6);
		employeeList.add(employee7);
		employeeList.add(employee8);
		employeeList.add(employee9);
		employeeList.add(employee10);
		
	
		//sort by Name asc
		employeeList.sort(( e1,  e2) -> e1.getEmpName().compareTo(e2.getEmpName()));
		
		//sort by Name desc
	    employeeList.sort(( e1,  e2) -> e2.getEmpName().compareTo(e1.getEmpName()));
		
		//sort by salary asc
		employeeList.sort(( e1,  e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
		
		
		employeeList.forEach(emp -> System.out.println(emp.getEmpName()));

		List<Employee> employeeFilterList = employeeList.stream().filter(emp -> emp.getSalary() >= 50000).limit(3)
				.collect(Collectors.toList());
		employeeFilterList.forEach(emp -> System.out.println(emp.getEmpName()));

		// get Max Salary Employee
		Employee maxSalEmp = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingInt(emp -> emp.getSalary()))).get();
		System.out.println("Max Emp Slaray: " + maxSalEmp.getEmpName());

		// get Min Salary Employee
		Employee minEmpSalary = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparingInt(emp -> emp.getSalary()))).get();
		System.out.println("Min Emp Slaray: " + minEmpSalary.getEmpName());

		List<Employee> empList = employeeList.stream().filter(emp -> emp.getSalary() >= 50000)
				.collect(Collectors.toList());
		empList.forEach(empName -> System.out.println(empName.getEmpName()));
	}

}
