package ArraylistSorting;

import java.util.Comparator;

public class ComparatorClass implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
	 int compareAge=  o1.getAge().compareTo(o2.getAge());
	 int compareSalary=o1.getSalary().compareTo(o2.getSalary()); 
	 if(compareAge == 0){
		 return compareSalary;
	 }
	 else
		 return compareAge;

}
}
