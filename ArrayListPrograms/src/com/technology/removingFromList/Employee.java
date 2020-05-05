package com.technology.removingFromList;

public class Employee {
	Integer id;
	String name;
	Integer salary;
	int age;
	public Employee(Integer id,String name,Integer salary,int age){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.age=age;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

}
