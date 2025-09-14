package AB58;

abstract class AmazonLoginFeature

{
	abstract void loginwithotp();                //   abstract method
	abstract void loginwithoutotp();             //   abstract method
	
	void registration()                          // concreet method
	{
		System.out.println("Exposing this logic");    
	}
	
	static void forgotpassword()                    // concreet method
	
	{
		System.out.println("Can't exposing this logic");
	}
}

public class ConcreetClass extends AmazonLoginFeature
{

	public static void main(String[] args)
	{
		

	}

	void loginwithotp()
	{
		
		System.out.println("Real logic 1");
	}

	
	void loginwithoutotp()
	{
		
		System.out.println("Real logic 2");
	}

}
