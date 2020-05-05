package com.technology.ArrayToList;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("enter 10 integers");
	int num[] = new int[10];
	for(int i=0;i<10;i++){
		num[i]=sc.nextInt();	
	}
    ArrayToArrayList list = new  ArrayToArrayList();
    ArrayList<Integer> numbers = new ArrayList <Integer> (10);
    numbers= list.getList(num);
    System.out.println(numbers);
	}

}
