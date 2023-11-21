package BasicPrograms;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int Characters=0,num=0,special=0,spaces=0;
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the String ");
		str=obj.next();
		
		int i=0; 
		while(i<str.length()){
		char ch=str.charAt(i);
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){ //Check Alphabets
			Characters++;
		}
		else if(ch>='0' && ch<='9'){ //Check numeric charaters
		    num++;
		}
		else if(ch ==' '){
			spaces++; //Check Space
		}
		else{
			special++; //Find special characters
		}
		i++;
		}
		System.out.println("\nAlphabet letters: "+Characters);
		System.out.println("Number: "+num);
		System.out.println("Space: "+spaces);
		System.out.println("Special characters: "+special);
		}
		
		

	}


