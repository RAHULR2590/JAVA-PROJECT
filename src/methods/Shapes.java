package methods;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes ob=new Shapes();
		ob.area();
		int recarea=ob.rec();
		System.out.println("rectangle area"+recarea);
		System.out.println(ob.cir(4));
       ob.sqr(4);
	}
      //method 1 triangle
	public void area()
	{
		int b=10;int h=20;
		double c=0.5*b*h;
		System.out.println(c);
	}
	public int rec()
	{
		int l=10;int b=20;
		int c=l*b;
		return c;
	}
	public double cir(double r)
	{
		
		double c=3.14*r*r;
		return c;
	}
	public void sqr(int a)
	{
		int c=a*a;
		System.out.println(c);
	}
	
}
