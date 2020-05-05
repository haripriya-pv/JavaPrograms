package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationOne {
	public void iteration(ArrayList<Integer> bank){
		Iterator iter = bank.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+"  ");
		}
		
	}

}
