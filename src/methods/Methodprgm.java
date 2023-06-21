package methods;

public class Methodprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodprgm ob=new Methodprgm();
		ob.add();
		int subt=ob.sub();
		System.out.println("subtraction="+subt);
		System.out.println(ob.mul(20,10));
		ob.div(2.3,3);
	

	}
	//method without return type and without parameter
	public void add()
	{
		int a=30,b=40;
		int c=a+b;
		System.out.println(c);
	}
	//method with return type and without parameter
	
	public int sub()
	{
		int a=30,b=20;
		int c=a-b;
		
		return c;
	}
	//method with return type and parameter
	
	public int mul(int a,int b)
	{
		int c=a*b;
		
		return c;
	}
	
	//method without returntype and with parameter
	
	public void div(double a,double b)
	{
		double c=a/b;
		System.out.println(c);
	}
	
	
		
				
	}
	


