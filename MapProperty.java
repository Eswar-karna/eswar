package AB58;

import java.util.HashMap;
import java.util.Map;

public class MapProperty 
{

	public static void main(String[] args)
	{
		Map<Integer, String> m1=new HashMap<Integer, String>();
		
		m1.put(514243, "Eswar");
		m1.put(514244, "Raji");
		m1.put(514245, "Dhana");
		m1.put(514246, "Srinu");
		
		System.out.println(m1);
		
Map<Integer, String> m2=new HashMap<Integer, String>();
		
		m2.put(514247, "Karna");
		m2.put(514248, "Venkata");
		m2.put(514249, "Hanumantha");
		m2.put(514242, "Aryan");
		
		m1.putAll(m2);
		
		System.out.println(m2);
		
		String value=m2.get(514248);
		System.out.println(value);

	}

}
