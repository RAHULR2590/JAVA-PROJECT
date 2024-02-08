package controlstatements;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		  String str;
		  String rev = "";
		    
		    System.out.println("Enter a name  ");
		   
		Scanner sc=new Scanner(System.in);
	
		    
		   str =sc.nextLine();
		   
		   int j=str.length();
		   
		   for(j=str.length()-1;j>=0;j--)
{
			  rev+=str.charAt(j);
		   }
		   System.out.println("reverse of the name is"+rev);

	}

}
