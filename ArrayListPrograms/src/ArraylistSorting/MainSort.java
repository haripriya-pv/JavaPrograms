package ArraylistSorting;

import java.util.ArrayList;
import java.util.Collections;

public class MainSort {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Employee emp1 = new Employee(1,"ram",30000,28);
		Employee emp2 = new Employee(5,"kiran",20000,26);
		Employee emp3 = new Employee(1,"john",33000,27);
		Employee emp4 = new Employee(1,"alan",40000,29);
		Employee emp5 = new Employee(1,"don",31000,27);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		System.out.println(employees);
		Collections.sort(employees);
		System.out.println("sorted"+employees);
		Collections.sort(employees, new ComparatorClass());
		System.out.println("sorted list by age and salary"+employees);
		

	}

}
