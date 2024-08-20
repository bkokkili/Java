package com.java8.features.Streams;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String location;
    private String specialization;
    private String mobile;

    public Employee(int id, String name, String department, double salary, String location, String specialization, String mobile) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.location = location;
        this.specialization = specialization;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                ", specialization='" + specialization + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}

