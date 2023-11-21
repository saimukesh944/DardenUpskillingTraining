package BasicPrograms;

import JavaPrograms.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomEmplpoyeeSortById {
	 
	 public static void main(String[] args) {
	 
	  List<Employee> emps = new ArrayList<>();
	 
	  emps.add(new Employee(2001, "Modi", 55));
	  emps.add(new Employee(1901, "Trumph", 57));
	  emps.add(new Employee(1950, "Boris Johnson", 56));
	 
	  System.out.println("Before sorting custom list of employees : ");
	  Iterator<Employee> it = emps.iterator();
	  while (it.hasNext()) {
	   System.out.println(it.next());
	  }
	  Collections.sort(emps);
	 
	  System.out.println("After sorting custom list of employees in natural order: ");
	  it = emps.iterator();
	  while (it.hasNext()) {
	   System.out.println(it.next());
	  }
	 
	  Collections.sort(emps, Collections.reverseOrder());
	 
	  System.out.println("After sorting custom list of employees in decendng order: ");
	  it = emps.iterator();
	  while (it.hasNext()) {
	   System.out.println(it.next());
	  }
	  
//	  List < Employee > employeesSortedList1 = employees.stream()
//	            .sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
//	        System.out.println(employeesSortedList1);
//
//	        List < Employee > employeesSortedList2 = employees.stream()
//	            .sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList()); //ascending order
//	        System.out.println(employeesSortedList2);
	    
	 
	 }
	 
	 
	}
