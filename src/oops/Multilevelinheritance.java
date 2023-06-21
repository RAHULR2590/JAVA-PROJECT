package oops;

class Animalss
{
	public void animalfood()
	{
		System.out.println("animalfood");
	}
}

class dogss extends Animalss
{
	public void breed()
	{
		System.out.println("lab");
	}
}
class babydogs extends dogss
{
	public void babydogfeatures()
	{
		System.out.println("babydog");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		babydogs baby=new babydogs();
		baby.animalfood();
		baby.breed();
		baby.babydogfeatures();

	}

}
