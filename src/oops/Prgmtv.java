package oops;

interface TVremote
{
	public void menu();
	public void exit();
	public void mute();
	
}

interface smarttvremote extends TVremote
{
	public void remotedetails();
}

class TV implements TVremote,smarttvremote
{

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("menu detials");
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.out.println("exit details");
		
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("mute details");
		
	}

	@Override
	public void remotedetails() {
		// TODO Auto-generated method stub
		System.out.println("remote details");
		
	}
	
}

public class Prgmtv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV ob=new TV();
		ob.exit();
		ob.menu();
		ob.mute();
		ob.remotedetails();

	}

}
