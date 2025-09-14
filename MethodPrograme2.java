package AB58;

public class MethodPrograme2

{
static void add (int a,int b)
		{
			System.out.println("Calling static method");
			System.out.println(a+b);
		}
		
		void sub ()
		{
			System.out.println("Calling non static method");
		}
		
		MethodPrograme2 (int a,int b)
		{
			System.out.println("Calling Constructor");
		}
		
	
		public static void main(String[] args)
		
		{
			System.out.println("Main method");
			
			add(45,55);
			MethodPrograme2 a1=new MethodPrograme2(35,65);
			a1.sub();
			

		}


	
	}


