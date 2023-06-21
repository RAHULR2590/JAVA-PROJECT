package basicprograms;

import java.util.Scanner;

public class Prgm10 {

	public static void main(String[] args) {
		
		
		//enter the numbers & display count of +ve,-ve & 0 entered
		System.out.println("enter the number of integers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int x=0,y=0,z=0;
		System.out.println("enter the integers");
		for(int i=1;i<=a;i++)
		{
			int b=sc.nextInt();
			if(b>0)
			{
				x++;
			}
			if(b<0)
			{
				y++;
			}
			if(b==0)
			{
				z++;
			}
			
		}
        System.out.println("number of positive numbers"+x);
        System.out.println("number of negative numbers"+y);
        System.out.println("number of zeros"+z);
	}

}
