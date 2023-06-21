package basicprograms;

import java.util.Scanner;

public class Prgm5 {

	public static void main(String[] args) {
		// read a set of integers and print sum of even & odd integers
		System.out.println("enter  number of integers");
		int even=0,odd=0,i;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	    for(i=1;i<=a;i++)
		{
		
			System.out.println("enter the integer"+i);
			int b=sc.nextInt();
		
			if(b%2==0)
			{
				even=even+b;
			}
			else
			{
				odd=odd+b;
			}
			
		}
		System.out.println("sum of even number"+even);
		System.out.println("sum of odd number"+odd);
		
		}

}
