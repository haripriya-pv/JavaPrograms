package com.technology.FailfastAndFailsafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExmp {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> bank = new CopyOnWriteArrayList <Integer> ();
		bank.add(5);
		bank.add(6);
		bank.add(7);
		bank.add(8);
		bank.add(9);
		System.out.println(bank);
		Iterator iter = bank.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+"  ");
			bank.add(4);
			//iter.remove();
		}
		


	}

}
