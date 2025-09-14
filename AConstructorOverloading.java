package AB58;

public class AConstructorOverloading
{

	AConstructorOverloading(int a,int b)
	
	{
		System.out.println("Constructor 1");
	}
	
	AConstructorOverloading(char a,int b)
	
	{
		this(21,13);
		System.out.println("Constructor 3");
	}
	AConstructorOverloading()
	
	{
		this('w',20);
		System.out.println("Constructor 2");
	}
	public static void main(String[] args)
	{
		
		AConstructorOverloading c1=new AConstructorOverloading();
	}

}
