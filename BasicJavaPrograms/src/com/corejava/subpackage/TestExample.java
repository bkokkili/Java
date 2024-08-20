package com.corejava.subpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employees {

	public Employees(int id, String empName, Long empPhone, int salary, String city) {
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

public class TestExample {

	public static void main(String[] args) {

		Employees employee2 = new Employees(120, "Balaji", 8801021900L, 40000, "Chennai");
		Employees employee3 = new Employees(130, "Raj", 8801021901L, 50000, "Hyderabad");
		Employees employee4 = new Employees(140, "Kumar", 8801021902L, 60000, "Banglore");
		Employees employee5 = new Employees(150, "Sampath", 8801021900L, 40000, "Chennai");
		Employees employee6 = new Employees(160, "Dan", 8801021901L, 20000, "Delhi");
		Employees employee7 = new Employees(170, "Rand", 8801021902L, 90000, "Mumbai");
		Employees employee8 = new Employees(180, "Daniel", 8801021900L, 14000, "Chennai");
		Employees employee9 = new Employees(190, "Krish", 8801021901L, 5000, "Vizag");
		Employees employee10 = new Employees(200, "Chandra", 8801021902L, 650000, "kochin");
		List<Employees> employeeList = new ArrayList<>();
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		employeeList.add(employee6);
		employeeList.add(employee7);
		employeeList.add(employee8);
		employeeList.add(employee9);
		employeeList.add(employee10);

		List<Employees> employees = employeeList.stream().filter(emp -> emp.getSalary() >= 6000).limit(3)
				.collect(Collectors.toList());
		employees.forEach(emp -> System.out.println(emp.getEmpName()));

		Employees employees2 = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingInt(emp -> emp.getSalary()))).get();
		System.out.println("Highset Salary : "+employees2.getEmpName());
		
		employeeList.stream().collect(Collectors.minBy(Comparator.comparingInt(emp -> emp.getSalary()))).get();
		
		
		String str = "Radar";
		
		String revString = "";
		for(int i = str.length()-1 ; i>=0; i--) {
			revString = revString + str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(revString)) {
			System.out.println("Stirng is palindrome");
		}
		System.out.print(revString);
		System.out.println();
		System.out.println(str.chars().filter(ch -> ch != ' ').count());
		
		Map<Character, Long> characterCountMap =  str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

		
		characterCountMap.forEach((k,v)->{
			if(v > 1) {
				System.out.println(k+ " : "+v);
			}
		});
		
		Map<Character, Integer> characterCount = new HashMap<>();
		char[] charArray = str.toCharArray();
		for(Character ch : charArray) {
			if(characterCount.containsKey(ch)) {
				characterCount.put(ch, characterCount.get(ch)+1);
			}else {
				characterCount.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey() + " "+entry.getValue());
			}
			
		}
		System.out.println(10+15+"Java"+10+15);
	}

}
