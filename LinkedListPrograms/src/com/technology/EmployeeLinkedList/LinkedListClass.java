package com.technology.EmployeeLinkedList;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<Employee> employees = new LinkedList<Employee>();
		Employee emp1 = new Employee(1,"ram",30000,28);
		Employee emp2 = new Employee(5,"kiran",20000,26);
		Employee emp3 = new Employee(4,"john",33000,27);
		Employee emp4 = new Employee(6,"alan",40000,55);
		Employee emp5 = new Employee(2,"don",31000,56);
		Employee emp6 = new Employee(11,"ramu",30000,18);
		Employee emp7 = new Employee(7,"kirana",20000,36);
		Employee emp8 = new Employee(9,"johny",33000,47);
		Employee emp9 = new Employee(8,"alanu",40000,65);
		Employee emp10 = new Employee(10,"doni",31000,66);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);
		employees.add(emp7);
		employees.add(emp8);
		employees.add(emp9);
		employees.add(emp10);
		System.out.println(employees);
		employees.remove(5);
		System.out.println(employees);
		employees.stream().filter(emp->emp.getAge()<50).forEach(System.out::print);
	}

}
