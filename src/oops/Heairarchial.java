package oops;

class Animal1
{
	public void animaldetails()
	{
		System.out.println("animal details");
	}
	
}
class Dog extends Animal1
{
	public void dogdetails()
	{
		System.out.println("dogdetails");
	}
}
class Tiger extends Animal1
{
	public void tigerdetails() 
	{
		System.out.println("tigerdetails");
	}
}

public class Heairarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog ob=new Dog();
		ob.animaldetails();
		ob.dogdetails();
		Tiger t=new Tiger();
		t.animaldetails();
		t.tigerdetails();
		
		

	}

}
