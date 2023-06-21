package controlstatements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String r="";
		
		System.out.println("enter a word");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		
		System.out.println("reverse="+r);
		
		if(s.equals(r))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		

	}

}
