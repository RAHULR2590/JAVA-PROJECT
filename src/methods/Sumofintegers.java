package methods;

import java.util.Scanner;

public class Sumofintegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Sumofintegers s=new Sumofintegers();
		int sum=s.sumofinteger(a);
		System.out.println("sum of integers="+sum);
	}
		
		public int sumofinteger(int a)
		{
			int r,s=0;
		while(a>0)
		{
			r=a%10;
			s=s+r;
			a=a/10;
		}
			
			return s;
		}
	

	}


