package pkg1;

import java.util.Scanner;

public class Addone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter three numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sum=a+b+c;
		System.out.println("sum of the numbers are" +sum);
		

	}

}
