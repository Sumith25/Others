
public class ThrowsDemo {
	void Divi() throws ArithmeticException
	{
		int a=45,b=0,rs;
		rs = a/b;
		System.out.println("\n\n The result is:"+rs);
	}
		
		public static void main(String[] args)
		{
			ThrowsDemo t = new ThrowsDemo();
			
			try
			{
				t.Divi();
			}
			catch(ArithmeticException e)
			{
				System.out.println("\n\n Error :" + e.getMessage());
			}
			System.out.println("\n\n End of Program");
		}
	}

