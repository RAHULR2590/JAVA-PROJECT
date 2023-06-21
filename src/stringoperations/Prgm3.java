package stringoperations;

import java.util.Scanner;

public class Prgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		System.out.println("enter a sentence");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				count++;
		}
		System.out.println("vowels in the given sentence is "+count);
		

	}

}
