package AB58;

import java.util.Arrays;
import java.util.Scanner;

public class HumanIputAtRuntime 
{

	public static void main(String[] args)
	
	{
		Scanner s1=new Scanner(System.in);
		int age[]=new int[4];
		
		for(int i=0;i<4;i++)
		{
			age[i]=s1.nextInt();
		}
		
		System.out.println(Arrays.toString(age));
		
		s1.close();
	
		
		
		/*age[0]=s1.nextInt();
		
		age[1]=s1.nextInt();
		age[2]=s1.nextInt();
		age[3]=s1.nextInt();
		
		System.out.println(Arrays.toString(age)); */

	}

}
