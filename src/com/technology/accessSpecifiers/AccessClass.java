package com.technology.accessSpecifiers;

public class AccessClass {
	public AccessClass(){
		System.out.println("public constructor,can access from everywhere");
		}
	private void display(){
		System.out.println("private method,Scope is within this class only"); 
	}
	protected void getScope(){
		System.out.println("protected:within package and its child class of other package");
	}
	void getSpecifier(){
		System.out.println("default,Scope is within same package");
	}
	

}
