package ExceptionHandlingAssignments;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		System.out.println("enter a,b");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c;
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
