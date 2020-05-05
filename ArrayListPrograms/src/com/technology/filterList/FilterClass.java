package com.technology.filterList;

import java.util.ArrayList;
import java.util.stream.Collectors;

import ArraylistSorting.Employee;

public class FilterClass {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Employee emp1 = new Employee(1,"ram",3000,28);
		Employee emp2 = new Employee(5,"kiran",20000,26);
		Employee emp3 = new Employee(4,"john",33000,27);
		Employee emp4 = new Employee(6,"alan",4000,55);
		Employee emp5 = new Employee(2,"don",31000,56);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		System.out.println(employees);
		ArrayList<Employee> employeesSorted = new ArrayList<Employee>();
		employeesSorted=(ArrayList<Employee>) employees.stream().filter(emp->emp.getSalary()>5000).collect(Collectors.toList());
        System.out.println(employeesSorted);
	}

}
