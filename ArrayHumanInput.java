package AB58;

import java.util.Arrays;

public class ArrayHumanInput 
// Copy the one array into another array
{

	public static void main(String[] args)
	{
		int array1[]=new int[4];
		
		array1[0]=45;
		array1[1]=46;
		array1[2]=49;
		array1[3]=87;
		
int array2[]=new int[4];

for(int i=0;i<array1.length;i++)
		
{
	array2[i]=array1[i];
}
	/*	array2[0]=array1[0];
		array2[1]=array1[1];
		array2[2]=array1[2];
		array2[3]=array1[3];  */
		
		System.out.println("Input array is ");
		System.out.println(Arrays.toString(array1));
		System.out.println("Output array is ");
		System.out.println(Arrays.toString(array2));


	}

}
