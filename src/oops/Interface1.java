package oops;

interface Basicanimals
{
	public void eat();
	public void sleep();
}

class Monkey
{
	public void jump()
	{
		System.out.println("jump details");
	}
	public void bite()
	{
		System.out.println("bite details");
	}
}

class Human extends Monkey implements Basicanimals
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat eat");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleep sleep");
		
	}
	
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human ob=new Human();
		ob.eat();
		ob.sleep();
		ob.bite();
		ob.jump();

	}

}
