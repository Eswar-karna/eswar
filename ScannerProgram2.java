package AB58;

import java.util.Scanner;

public class ScannerProgram2 
{

	public static void main(String[] args)
	{
		Scanner S1=new Scanner(System.in);
		
	int a=	S1.nextInt();
	System.out.println(a);
		short b=S1.nextShort();
		System.out.println(b);
		byte c=S1.nextByte();
		System.out.println(c);
		long l=S1.nextLong();
		System.out.println(l);
		float f=S1.nextFloat();
		System.out.println(f);
	double d=	S1.nextDouble();
	System.out.println(d);
		boolean b1=S1.nextBoolean();
		System.out.println(b1);
		String name= S1.next();
		System.out.println(name);
		
		S1.close();

	}

}
