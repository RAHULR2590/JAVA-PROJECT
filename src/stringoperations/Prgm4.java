package stringoperations;

public class Prgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s2="Selenium web driver is used for webapplication testing";
		
		String[] sr=s2.split(" ");
		for(String v:sr)
		{
			System.out.println(v);
			if(v.contains("webapplication"))
			{
				break;
			}
		}
		
			
		
		
		
	
		
		
		

	}

}
