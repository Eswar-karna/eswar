package AB58;

import java.util.Arrays;

// Copy and paste the array in reverse order

public class ArrayPrograme2
{

	public static void main(String[] args)
	{
		int rollnoA[]=new int[4];
		
		rollnoA[0]=32;
		rollnoA[1]=39;
		rollnoA[2]=35;
		rollnoA[3]=33;

		int rollnoB[]=new int[4];
		
		rollnoB[3]=rollnoA[0];
		rollnoB[2]=rollnoA[1];
		rollnoB[1]=rollnoA[2];
		rollnoB[0]=rollnoA[3];
		
		/*
		
		for(int i=0,j=3;i<rollnoA.length;i++,j--);
		
		{
			rollnoB[j]=rollnoA[i];
			
		}
		*/
		System.out.println(Arrays.toString(rollnoA));
		System.out.println(Arrays.toString(rollnoB));
			
			
		}
	}


