package controlstatements;

public class Stringcount {

	public static void main(String[] args) {
		
		String s="RAHUL";
		int count=0,i=0;

		while(i<s.length())
		{
		 if(s.charAt(i)!=' ')
		 {
			 count++;
		 }
		 i++;
			
		}

		System.out.println("count c="+count);


	}

}
