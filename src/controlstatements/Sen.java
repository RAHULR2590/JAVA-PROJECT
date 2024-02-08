package controlstatements;

import java.util.Scanner;

public class Sen {

	public static void main(String[] args) {
		
		
		String rev="";
		System.out.println("enter the sentence to be reversed");
		
			Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        
	        
	       
	        String s[] = str.split(" ");
	        
	      
	        for(int i=0;i<s.length;i++){
	            rev = s[i]+" "+rev;
	        }
	        
	       
	        System.out.println("Reversed sentence: " + rev);
	  } 

		}


	


