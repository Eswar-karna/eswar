package AB58;

public class MethodPrograme
{

		static void add ()
		{
			System.out.println("Calling static method");
		}
		
		void sub ()
		{
			System.out.println("Calling non static method");
		}
		
		MethodPrograme ()
		{
			System.out.println("Calling Constructor");
		}
		
	
		public static void main(String[] args)
		
		{
			System.out.println("Main method");
			
			add();
			MethodPrograme a1=new MethodPrograme();
			a1.sub();
			

		}


	}


