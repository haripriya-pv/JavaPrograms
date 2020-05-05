package com.technology.ArrayToList;

import java.util.ArrayList;

public class ArrayToArrayList {

	public ArrayList<Integer> getList(int[] arr) {
		ArrayList<Integer> numbers = new ArrayList <Integer> ();
		for(int i=0;i<arr.length;i++){
			numbers.add(arr[i]);
		}
		return numbers;	
	}

}
