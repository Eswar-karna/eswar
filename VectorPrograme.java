package AB58;

import java.util.Enumeration;
import java.util.Vector;

public class VectorPrograme
{

	public static void main(String[] args)
	{
		Vector v1=new Vector();
		
		v1.addElement(90);
		v1.addElement(91);
		v1.addElement(92);
		v1.addElement(93);
		v1.addElement(94);
		
		System.out.println(v1);
		
		Enumeration e1=v1.elements();
		
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		

	}

}
