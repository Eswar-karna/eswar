package AB58;

public class AmazonPrograme 
{
	AmazonPrograme()
	
	{
		
		System.out.println("Constructor 1");
	}
	
	AmazonPrograme(int a)
	
	{
		System.out.println("Constructor 2");
		System.out.println(a);
	}
	
AmazonPrograme(String name)
	
	{
		
		System.out.println("Constructor 3");
	}

AmazonPrograme(String name, int b)

{
	
	System.out.println("Constructor 4");
	System.out.println(b);
}
	public static void main(String[] args) 
	{
		//AmazonPrograme a1=new AmazonPrograme();
		//AmazonPrograme b1=new AmazonPrograme(45);
		
		new AmazonPrograme();
		new AmazonPrograme(45);
		new AmazonPrograme("Eswar");
		new AmazonPrograme("Karna",100);
		
	}

}
