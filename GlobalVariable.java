package AB58;

public class GlobalVariable

{

	int noofdaysinjanuary=31; // instance variable (Global variable which is non-static)
	static int daysinyear=365;
	
	static void add()
	{ 
	  int totaldays=daysinyear*2;
	  System.out.println(totaldays);
	}
	public static void main(String[] args)
	{
		
add();
System.out.println(daysinyear);  // static
GlobalVariable g1=new GlobalVariable();  // Non static
System.out.println(g1.noofdaysinjanuary);
	}

}
