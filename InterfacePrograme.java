package AB58;

interface AmazonloginPrograme

{
	void loginwithotp();
	void loginwithoutotp();
	
}

public class InterfacePrograme implements AmazonloginPrograme                // interface progrme is Just a classname
{

	public static void main(String[] args)
	{
		

	}

	
	public void loginwithotp()
	{
		
		System.out.println("Logic that will stay with us");
	}

	
	public void loginwithoutotp()
	{
		
		System.out.println("Logic that will stay with us");
	}

}
