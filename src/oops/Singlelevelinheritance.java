package oops;

class Animals
{
	public void animalfood()
	{
		System.out.println("animalfood");
	}
}

class Dogs extends Animals
{
	public void breed()
	{
		System.out.println("lab");
	}
}
public class Singlelevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs ob=new Dogs();
		ob.animalfood();
		ob.breed();

	}

}
