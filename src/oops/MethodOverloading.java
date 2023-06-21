package oops;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ob=new MethodOverloading();
		ob.add();
		ob.add(20,10);
		ob.add(3,3.4);
		ob.add(4.4,4);

	}
	
	public void add()
	{
		int a=20,b=10,c;
		c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}

}
