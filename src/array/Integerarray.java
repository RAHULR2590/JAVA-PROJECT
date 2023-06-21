package array;

import java.util.Scanner;

public class Integerarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		
		
		for(int i=0;i<4;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		
		int s=0;int a;
		for(int v:ar)
		{
		
		s=s+v;
		
		}
		a=s/4;
		System.out.println("sum="+s);
		System.out.println("average="+a);

	}

}
