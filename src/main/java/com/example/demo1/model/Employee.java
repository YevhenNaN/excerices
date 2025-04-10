package com.example.demo1.model;

import java.util.List;

public class Employee {
    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getSalary() { return salary; }

    public static List<Employee> getMockEmployees() {
        return List.of(
                new Employee("Alice", 75000),
                new Employee("Bob", 48000),
                new Employee("Charlie", 60000),
                new Employee("David", 52000),
                new Employee("Eve", 40000)
        );
    }

    public static List<String> getHighEarners(List<Employee> employees) {
        return employees
                .stream()
                .filter(emp -> emp.getSalary() > 50000)
                .map(Employee::getName)
                .toList();
    }

}

