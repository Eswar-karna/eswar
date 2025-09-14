package AB58;

import java.util.Arrays;

public class ArrayProblem
{

	public static void main(String[] args) 
	{
		String [] name=new String[4];
		
		name[0]="Raju";
		name[1]="Dhana";
		name[2]="Vidya";
		name[3]="Bhavya";
		
		System.out.println(Arrays.toString(name));
		

		int [] age=new int[4];
		
		age[0]=12;
		age[1]=19;
		age[2]=22;
		age[3]=42;
		
		System.out.println(Arrays.toString(age));
		
		for(int i=0;i<name.length;i++)
			
		{
			System.out.println(name[i]   +   age[i]);
		}
		
		
		boolean []b1=new boolean[4];
		
	b1[0]=true;
	b1[1]=true;
	b1[2]=true;
	b1[3]=true;
	
	System.out.println(Arrays.toString(b1));
	}
	
	
		

}
