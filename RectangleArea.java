package AB58;

import java.util.Scanner;

public class RectangleArea
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Lets enter the value of l");
		
	int l=	s1.nextInt();
	
	System.out.println("Lets enter the value of b");
	
	int b= s1.nextInt();
	
	
	int area= l*b;
	
	System.out.println("The area of the square is");
	
	System.out.println(area);
	
	s1.close();

	}

}
