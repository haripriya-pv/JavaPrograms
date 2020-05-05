package Arraylist;

import java.util.ArrayList;

public class ExtendList {
	

	public static void main(String[] args) {
		ArrayList<Integer> bank = new ArrayList <Integer> (5);
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
		IterationOne itr=new IterationOne();
		itr.iteration(bank);
		IterationTwo itrfor = new IterationTwo();
		itrfor.forloopitr();
		IterationThree itrforEach = new IterationThree();
		itrforEach.forEachitr(bank);

	}

}
