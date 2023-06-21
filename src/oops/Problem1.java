package oops;

class Member
{
	
	  String name;
	  int age;
	  String phoneno;
	  String address;
	  int salary;
	  public void printdetails()
	  
	  {
		  System.out.println("name="+name);
		  System.out.println("age="+age);
		  System.out.println("phoneno="+phoneno);
		  System.out.println("address="+address);
		  System.out.println("salary="+salary);
	  }
	  
	
}

class Employee extends Member
{
	String specialization;
}
class Manager extends Member
{
	String department;
}


public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee();
		emp1.name="arun";
		emp1.age=24;
		emp1.phoneno="658974512";
		emp1.address="abvc";
		emp1.salary=10000;
		System.out.println(emp1.specialization="tester");
		emp1.printdetails();
		
		Manager mn=new Manager();
		mn.department="electrical";
		System.out.println(mn.department="electrical");
		
		

	}

}
