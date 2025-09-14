package AB58;

public class NestedIfElsePrograme

{
	public static void main(String[] args)
	
	{
	int a=10;
	int b=20;
	int c=30;
	if(a<b)
	{
             if(a<c)
             {
            	System.out.println("a is lesser than both b and c"); 
            	
            	if(a==40)
            	{
            		System.out.println("Satisfying all 3 conditions");
            	}
             }
             else
             {
            	 System.out.println("a is lesser than b but not c"); 
             }
	}
	else
	{
		
		System.out.println("a is greater than b");
	}
	}
}
