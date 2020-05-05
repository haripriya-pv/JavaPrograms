package Arraylist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterationTwo {
	public void forloopitr(){
		List<Integer> bank =  Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println();
		for(int i=0;i<bank.size();i++){
			System.out.print(bank.get(i)+" ");
		}
	}

}
