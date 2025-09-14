package AB58;

import java.util.Scanner;

public class ExceptionHandling2 
{

	public static void main(String[] args)
	{
		
	try
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Please enter the Size of an array");

		int rollno[]=new int[s1.nextInt()];
	}
catch(NegativeArraySizeException a1)
	{
	System.out.println("Handle the exception");
	}
	
	}
}
