package BasicPrograms;

public class Armstrong {

	public static void main(String[] args) {


		int num=153,result=0,temp,rem;
		temp=num;
		while(num>0) {
			rem=num%10;
			result+=Math.pow(rem, 3);
			temp/=10;
			
		}
       if(result==num) {
	     System.out.println("Armstrong");
         }
	else
	{
		System.out.println("NotArmstrong");
	}
		
	}

}
