package AB58;

public class TypeofVariable 
{
   static int a=100; //global variable
   
	public static void main(String[] args)
	{
		int a=150; // local variable
		
		System.out.println(a);
		System.out.println(TypeofVariable.a); // this how to access global variable classname.variablename;
	}

}
