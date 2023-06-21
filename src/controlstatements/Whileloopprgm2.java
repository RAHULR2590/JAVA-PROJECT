package controlstatements;

public class Whileloopprgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3456;
		int c=0;
		int b;
		while(n>0)

		{
			b=n%10;
			c=c*10+b;
			n=n/10;
			
		}
		System.out.println("reverse is" +c);
	}

}
