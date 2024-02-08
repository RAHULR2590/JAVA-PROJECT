package basicprograms;

import java.util.Scanner;

public class Prgm4 {

	public static void main(String[] args) {
		// sum of 10 natural numbers
		
		int i;
		int sum=0;
		
		System.out.println("enter 10 numbers");
		Scanner sc=new Scanner(System.in);
		
		
		for(i=1;i<=10;i++)
		{
			int x=sc.nextInt();
			sum =sum+x;
		}
		System.out.println("sum of 10 natural numbers "+sum);
		
		
	
		

	}

}
