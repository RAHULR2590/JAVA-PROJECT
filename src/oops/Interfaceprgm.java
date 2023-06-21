package oops;

interface Bank
{
	public void deposit();
	public void withdraw();
	public void balance();
}

interface creditcard
{
	public void creditcarddetails();
}

class SBI implements Bank,creditcard
{


@Override
public void creditcarddetails() {
	// TODO Auto-generated method stub
	System.out.println("credit card details");
	
}

@Override
public void deposit() {
	// TODO Auto-generated method stub
	System.out.println("deposit details");
	
}

@Override
public void withdraw() {
	// TODO Auto-generated method stub
	System.out.println("withderawal details");
}

@Override
public void balance() {
	// TODO Auto-generated method stub
	System.out.println("balance details");
}
}
 
class Federal implements Bank
	
{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
	System.out.println("federal deposit");
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Federal withdraw");
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Federal  balance");
		
	}
}
	public class Interfaceprgm {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Bank ob=new SBI();
			ob.balance();
			ob.deposit();
			ob.withdraw();
			
			Bank s=new Federal();
			s.balance();
			s.deposit();
			s.withdraw();

		}
	}

		
	

	

	

