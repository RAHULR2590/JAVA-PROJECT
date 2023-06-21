package oops;

public class Exceptionprgm {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		
		try {
			int a=20,b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("arithematic exception");
		}
		System.out.println("hello");
		
		try {
			int []a=new int[2];
			a[0]=32;
			a[1]=34;
			System.out.println(a[3]);
			
		}
		catch(Exception e)
		{
			System.out.println("arrayindexboundofexception");
		}
		
         try 
         {
        	 String s=null;
        	 System.out.println(s);
        	 
         }
         catch(Exception e)
         {
        	 System.out.println("nullpointerexception");
         }
	}

}
