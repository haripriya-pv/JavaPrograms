package com.technology.AccessFromOtherPackage;

import com.technology.accessSpecifiers.AccessClass;

public class AccessChild extends AccessClass{

	public static void main(String[] args) {
		AccessChild newobj= new AccessChild ();
		newobj.getScope();
		
	}

}
