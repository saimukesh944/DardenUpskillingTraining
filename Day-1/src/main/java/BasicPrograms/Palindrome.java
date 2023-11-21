package BasicPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=646,temp,sum=0,rem;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			temp/=10;
			
		}
       if(sum==num) {
	     System.out.println("Palindrome");
         }
	else
	{
		System.out.println("Not Palindrome");
	}
		
	}

	

}
