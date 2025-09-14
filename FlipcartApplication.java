package AB58;

abstract class LoginOTP
{
	abstract void viaSMS();
	abstract void viaCall();
	
}

abstract class LoginFeature extends LoginOTP
{
	abstract void withOTP();
	abstract void withoutOTP();
	void withmobile()
	{
		System.out.println("This logic is exposing");
	}
}
public class FlipcartApplication extends LoginFeature
{

	void searchingproduct()
	
	{
	
		System.out.println("This logic is not exposed");
}

void payments()

{
	System.out.println("This logic won't be exposed");
}
	public static void main(String[] args) 
	{
		

	}

	
	void withOTP() 
	{
		
		System.out.println("This logic is not exposed");
	}

	
	void withoutOTP()
	{
		
		System.out.println("This logic is not exposed");
	}

	
	void viaSMS()
	{
		System.out.println("This logic is not exposed");
		
	}

	
	void viaCall() 
	{
		
		System.out.println("This logic is not exposed");
	}

}
