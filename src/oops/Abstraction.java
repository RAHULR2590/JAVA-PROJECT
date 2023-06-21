package oops;

abstract class Carz{
	
	abstract public void speedlimit();
	public void carengine()
	{
		System.out.println("car engine");
	}
}
class Maruti extends Carz
{

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("speed limit");

		
	}
	
	
	

	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maruti m=new Maruti();
		m.carengine();
		m.speedlimit();
		

	}

}
