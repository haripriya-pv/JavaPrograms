package com.technology.FailfastAndFailsafe;

import java.util.ArrayList;
import java.util.Iterator;

public class FailfastExmp {

	public static void main(String[] args) {
		ArrayList<Integer> bank = new ArrayList <Integer> ();
		bank.add(5);
		bank.add(6);
		bank.add(7);
		bank.add(8);
		bank.add(9);
		bank.add(10);
		bank.add(11);
		bank.add(12);
		bank.add(13);
		bank.add(14);
		System.out.println(bank);
		Iterator iter = bank.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+"  ");
			// removing an element from ArrayList
            // exception will be thrown on next call 
            // of next() method. 
			bank.remove(1);
			//iter.remove();
		}
		System.out.println(bank);

	}

}
