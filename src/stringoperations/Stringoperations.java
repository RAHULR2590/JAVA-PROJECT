package stringoperations;

public class Stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.concatenation
		
		String s="hello";
		String s1="welcome";
		String s2="Hello how are you";
		
		
		System.out.println(s.concat(s1));//hellowelcome
		System.out.println(s+s1);
		System.out.println(1+2+s+4+5);//3hello45
		
		//equals
		
		System.out.println(s.equals(s1));//false
		System.out.println(s.equals(s2));//false
		System.out.println(s.equalsIgnoreCase(s2));//true
		
		//contains
		
		System.out.println(s2.contains("how"));//true
		
		//touppercase & tolowercase
		 
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//trim
		
		System.out.println(s1.trim());
		
		//length
		
		System.out.println(s.length());
		
		//startswith
		
		System.out.println(s2.startsWith("hello"));
		
		//endswith
		
		System.out.println(s2.endsWith("you"));
		
		//substring
		
		System.out.println(s2.substring(2,8));
		
		//charAt
		
		System.out.println(s.charAt(1));
		
		//split
		
		String[] sr=s2.split(" ");
		for(String v:sr)
		{
			System.out.println(v);
		}
		
		
		

	}

}
