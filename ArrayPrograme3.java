package AB58;

import java.util.Arrays;

// Compare the two Arrays true or false

public class ArrayPrograme3

{

	public static void main(String[] args)
	{
		int Array1[]=new int[5];
		int Array2[]=new int[5];
		
		Array1[0]=12;
		Array1[1]=12;
		Array1[2]=12;
		Array1[3]=12;
		Array1[4]=12;
		
		Array2[0]=12;
		Array2[1]=12;
		Array2[2]=12;
		Array2[3]=12;
		Array2[4]=12;
		
if(Arrays.equals(Array1, Array2))
{
System.out.println("Arrays are equals");
}
else
{
	System.out.println("Arrays are not equal");
}
}
}