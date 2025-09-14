package AB58;

public class NonStaticMethod

{
  
	void add ()
	{
		System.out.println("Adding");
	}
	
	void sub ()
	{
		System.out.println("Substracting");
	}
	
	void mul ()
	{
		System.out.println("Multiplicating");
	}
	
	
	public static void main(String[] args)
	
	{
		System.out.println("Main method");
		
		NonStaticMethod a1=new NonStaticMethod();
		a1.add();
		a1.sub();
		a1.mul();

	}

}
