package LamdaAssignments;

public class Lambda02 {
	
	interface lambda{
		int operation(int x,int y);
	}
	public static double addition(int num1,int num2) {
		lambda get=(a,b) -> (a+b);
		return (double)(get.operation(num1,num2));
	}
	public static double subtraction(int num1,int num2) {
		lambda get=(a,b) -> (a-b);
		return (double)(get.operation(num1,num2));
	}
	public static double multiplication(int num1,int num2) {
		lambda get=(a,b) -> (a*b);
		return (double)(get.operation(num1,num2));
	}
	public static double division(int num1,int num2) {
		lambda get=(a,b) -> (a/b);
		return (double)(get.operation(num1,num2));
	}

	public static void main(String[] args) {
		int x=12, y=6;
		System.out.println(addition(x,y));
		System.out.println(subtraction(x,y));
		System.out.println(multiplication(x,y));
		System.out.println(division(x,y));
	}
}