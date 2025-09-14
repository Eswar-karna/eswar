package AB58;

public class LogicalOperator
{

	public static void main(String[] args)
	{
		int age=20;
		char gender='M';
		if(age>=18 && gender=='M')
		{
			System.out.println("Person can vote 1");
		}
		if(age>=18 || gender=='M')
		{
			System.out.println("Person can vote 2");
		}
		
		if(age>=18 && gender=='F')
		{
			System.out.println("Person can vote 3");
		}
	
	
	
	
	if(!(age>=18 && gender=='M'))
	{
		System.out.println("Person can vote 4");
	}
	
	if(!(age>=18 || gender=='M'))
	{
		System.out.println("Person can vote 5");
	}
	if(!(age>=18 && gender=='F'))
	{
		System.out.println("Person can vote 6");
	}
}
	
}
