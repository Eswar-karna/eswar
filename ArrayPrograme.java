package AB58;

import java.util.Arrays;

public class ArrayPrograme 
{

	public static void main(String[] args) 
	{
		String a="abcd";
		char c1[]=a.toCharArray();
		
		for(int i=0;i<a.length();i++)

		{
			System.out.println(c1[i]);
		}
		
		System.out.println(Arrays.toString(c1));
		
	}
	

	
}


