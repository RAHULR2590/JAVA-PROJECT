package basicprograms;

import java.util.Scanner;

public class Prgm9 {

	public static void main(String[] args) {
		// Prime number or not
		
		
		System.out.println("enter a positive integer");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int c=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				c++;
			}
		}
        if(c==2)
        {
        	System.out.println("number is prime ");
        }
        else
        {
        	System.out.println("number is not prime");
        }
	}

}
