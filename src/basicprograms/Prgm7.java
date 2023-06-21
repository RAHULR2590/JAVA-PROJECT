package basicprograms;

import java.util.Scanner;

public class Prgm7 {

	public static void main(String[] args) {
		// take 10 integers from keyboard and print average value on the screen
		
		int i,sum=0;
		float average;
		float n=10;
		System.out.println("enter the 10 integers");
		Scanner sc=new Scanner(System.in);
	    for(i=1;i<=10;i++)
		{
		
	    	int b=sc.nextInt();
		    sum=sum+b;
		    
			
		}
	    
	    average=sum/n;
	    System.out.println("average of integers is" +average);
		
		
		}


	}


