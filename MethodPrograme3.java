package AB58;

public class MethodPrograme3 

{

	static void add (int a,int b)
	{
		System.out.println("Calling static method");
		System.out.println(a+b);
	}
	
	static void add (char a,int b)
	{
		System.out.println("Calling static method");
		System.out.println(a+b);
	}
	void sub ()
	{
		System.out.println("Calling non static method");
	}
	
	void sub (int a,String b)
	{
		System.out.println("Calling non static method");
	}
	MethodPrograme3 (int a,int b)
	{
		System.out.println("Calling Constructor");
	}
	
	MethodPrograme3 (String a,int c)
	{
		System.out.println("Calling Constructor");
	}
	

	public static void main(String[] args)
	
	{
		System.out.println("Main method");
		
		add(45,55);
		add('r',100);
		MethodPrograme3 a1=new MethodPrograme3(13,12);
	
		a1.sub();
		a1.sub(32,"Eswar");
		

	}

	}


