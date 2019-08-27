
public class ExceptionsDemo {
public static void main(String[] a)
{
	String languages[] = {"C","C++","Java",
			"Perl","Python","sdfd"};
	
	try
	{
		for(int i =0 ; i<=7; i++)
		{
			System.out.println(languages[i]);
		}
	}
	catch(Exception e)
	{
		//System.out.println(e);
		e.printStackTrace();

	}
}
}
