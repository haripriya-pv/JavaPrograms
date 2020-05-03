package com.technology.accessSpecifiers;

public class AccessMain {
	private static void getIdea(){
		System.out.println("private: access within same class only");
	}

	public static void main(String[] args) {
		AccessClass obj = new AccessClass();
		//obj.display(); can't call because its private.
		obj.getScope();
		obj.getSpecifier();
		getIdea();

	}

}
