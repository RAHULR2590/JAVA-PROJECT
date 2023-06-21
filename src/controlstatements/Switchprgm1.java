package controlstatements;

public class Switchprgm1 {

	public static void main(String[] args) {
		
		int a=30,b=20;
		int op=3;
	
		
		switch(op)
		{
		case 1:System.out.println(+(a+b));
		break;
		case 2:System.out.println(+(a-b));
		break;
		case 3:System.out.println(+(a*b));
		break;
		case 4:System.out.println(+(a/b));
		break;
		default:System.out.println("invalid");
		
		}
		
		

	}

}
