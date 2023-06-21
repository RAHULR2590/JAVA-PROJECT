package oops;

public class Student {
	
	int studentid;
	String studentname;
	String college="cet";
	
	public Student(int studentid,String studentname)
	{
		this.studentid=studentid;
		this.studentname=studentname;
		
				
	}
	
	public void display()
	{
		System.out.println("studentid="+studentid);
		System.out.println("studentname="+studentname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student(101,"rahul");
		s.display();

	}

}
