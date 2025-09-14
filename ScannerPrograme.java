package AB58;

import java.util.Scanner;

public class ScannerPrograme
{

	public static void main(String[] args) 
	{
		Scanner S1=new Scanner(System.in);
		System.out.println("Please enter the value of a:");
		
		int a= S1.nextInt();
		
		System.out.println("Please enter the value of b:");
		int b= S1.nextInt();
		
		System.out.println("the sum of the two numbers:");
		int sum=a+b;
		System.out.println(sum);
		S1.close();

	}

}
