package AB58;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedException2
{

	public static void main(String[] args) 
	{
		try {
			URL u1=new URL("https://wwww.google.com");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
