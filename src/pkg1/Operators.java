package pkg1;

public class Operators {

	public static void main(String[] args) {
		
		
		//Arithematic operators
		
		int a=20,b=10;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		//Assignment operator
		
		int c=30,d=20;
		System.out.println("c+=d"+(c+=d));
		System.out.println("c-=d"+(c-=d));
		System.out.println("c*=d"+(c*=d));
		System.out.println("c/=d"+(c/=d));
		
		
		//Relational operators
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		
		//logical operator
		
		//      A    B     A&&B     A||B    !A    !B
		//      0    0      0         1      1     1
		//      1    0      0         1      0     1
		//      0    1      0         1      1     0
		//      1    1      1         1      0     0
		
		String username ="abc";
		String pswd ="123";
		System.out.println(username=="abc" && pswd=="123");
		System.out.println(username=="abc" || pswd=="1234");
		System.out.println(username=="abc" && pswd=="1234");
		
		//unary operator
		// ++ increment by 1
		// -- decrementb by 1
		//d1++ post incrementation
		//++d1 pre incrementation
		
		int d1=2;
		System.out.println(d1++);
		System.out.println(d1);
		
		
		

	}

}
