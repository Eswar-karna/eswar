package AB58;

import java.util.Scanner;

public class AreaoftheCircle 
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Let's find out the area of circle");
		
		System.out.println("Provide the value of r");
		
		int r=s1.nextInt();
		
		double areaofcircle= Math.PI*r*r;
		
		System.out.println("Area of circle");
		
		s1.close();

	}

}
