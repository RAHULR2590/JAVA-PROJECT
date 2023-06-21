package oops;

class car
{
	public void accelator()
	{
		System.out.println("accelator");
	}
}
class BMW extends car
{

	@Override
	public void accelator() {
		
		System.out.println("bmw accelator");
		super.accelator();
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW ob=new BMW();
		ob.accelator();

	}

}
