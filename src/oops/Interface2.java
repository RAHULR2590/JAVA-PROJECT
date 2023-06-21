package oops;

import java.util.Scanner;

interface bank
{
	public void personaldetails(String name);
	public void withdrawal();
	public void deposit();
	public void balance();
	
}

class Sbi implements bank
{
	static String bankname="sbi";
	int accountno;
	int balance=10000;
	Scanner sc=new Scanner(System.in);
	

	@Override
	public void personaldetails(String name) {
		// TODO Auto-generated method stub
		System.out.println("bank name "+bankname);
		System.out.println("enter your account no:");
		accountno=sc.nextInt();
		System.out.println("Acount no"+accountno);
		System.out.println("Your name is "+name);
		
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("enter your withdrawal amount");
		int amount=sc.nextInt();
		balance=balance-amount;
		System.out.println("balance"+balance);
				
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("enter your deposit amount");
		int dep=sc.nextInt();
		balance=balance+dep;
		System.out.println("balance="+balance);
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println(balance);
		
	}

	
	
}


public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi ob=new Sbi();
		ob.personaldetails("Rahul");
		ob.balance();
		ob.deposit();
		ob.withdrawal();

	}

}
