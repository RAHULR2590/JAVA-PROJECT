package basicprograms;

import java.util.Scanner;

public class Prgm6 {

	public static void main(String[] args) {
		// Fibonacci series
		
		System.out.println("enter number of terms");
		
		int a=0,b=1,c,i;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
		System.out.println(+a);
		c=a+b;
		a=b;
		b=c;
				
		}
		
		

	}

}
