package AB58;

	import java.util.Collection;
import java.util.HashMap;
	import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
	
	public class MapProperty2
	{


		public static void main(String[] args)
		{
			Map<Integer, String> m1=new HashMap<Integer, String>();
			
			m1.put(514243, "Eswar");
			m1.put(514244, "Raji");
			m1.put(514245, "Dhana");
			m1.put(514246, "Srinu");
			
			System.out.println(m1);
			
		Set<Integer> s1=m1.keySet();  // You can only iterate the keys
		Collection<String> c1=m1.values(); // You can only iterate the values
		Set<Entry<Integer, String>> s3=m1.entrySet(); // both keys and values can be iterate
		
		System.out.println("Iterate the keys using keyset");
		
		for(Integer i3:m1.keySet())
			
		{
			System.out.println(i3);
		

	}

		System.out.println("Iterate the values using valueset");
		
		for(String i3:m1.values())
			
		{
			System.out.println(i3);
		}
		
		System.out.println("Iterate the both values and keys");
		
		for(Entry<Integer, String> e3:m1.entrySet())
			
		{
			System.out.println(e3);
		}
}
		
	}
