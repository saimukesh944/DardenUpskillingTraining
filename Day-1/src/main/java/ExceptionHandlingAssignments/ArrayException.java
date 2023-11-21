package ExceptionHandlingAssignments;

import java.util.Scanner;

public class ArrayException{
    
	int i;
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        
    	Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        try {
            while(true) {
                int i=0;
                if(i==5) 
                    throw new ArrayIndexOutOfBoundsException();
                    arr[i++]=sc.nextInt();

                }
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Array is exceeded");
            }

        }
}
