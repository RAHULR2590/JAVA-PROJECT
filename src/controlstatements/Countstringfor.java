package controlstatements;

import java.util.Scanner;

public class Countstringfor {

	public static void main(String[] args) {
		
		String s;
		int count = 0;
		int i=0;
		
		System.out.println("Enter the string to be counted");
		 Scanner sc=new Scanner(System.in);
		 s=sc.nextLine();
		 for(i=1;i<=s.length();i++)
		 {
			 count=0+i;
		 }
		 System.out.println("Count of the string entered"+count);
		 

	}

}
