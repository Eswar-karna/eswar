package AB58;

interface A
{
	void method1();
	void method2();
}

interface B extends A 
{
	void method3();
	void method4();
}
public class InterfacePrograme2 implements B

{

	public static void main(String[] args)
	
	{
		

	}

	
	public void method1() 
	{
		
		System.out.println("Logic 1");
	}

	
	public void method2() 
	{
		
		System.out.println("Logic 2");
	}

	
	public void method3()
	{
		
		System.out.println("Logic 3");
	}

	
	public void method4() 
	{
		
		System.out.println("Logic 4");
	}

}
