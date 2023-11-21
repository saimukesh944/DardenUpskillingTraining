package BasicPrograms;

import JavaPrograms.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> obj=new ArrayList<Employee>();
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter How many records you want");
		
		int j=in.nextInt();
		
		for(int i=0;i<=j;i++) {
			System.out.println("Enter the id of Employee");
			int id=in.nextInt();
			System.out.println("Enter the name of the Employee");
			String name=in.next();
			System.out.println("Enter the age of Employee");
			int age=in.nextInt();
			
			obj.add(new Employee(id,name,age));
			
			
		}
		List<Employee> sortemployee=obj.stream().sorted((o1,o2)->(int)(o1.getId()-o2.getId())).collect(Collectors.toList());
//		System.out.println(sortemployee);
		
		Iterator <Employee> itr=sortemployee.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		
			

	}

}
