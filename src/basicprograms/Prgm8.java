package basicprograms;

import java.util.Scanner;

public class Prgm8 {

	public static void main(String[] args) {
		// Armstrong number
		
		int sum=0,r;
		System.out.println("enter a 3 digit number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==a)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}


	}

}
