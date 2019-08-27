import java.util.Scanner;
public class Division {
		public static void main(String [] args)
		{
			int a,b,res;
			
			Scanner i = new Scanner(System.in);
			
			System.out.println("Input Two Numbers:");
			
			a = i.nextInt();
			b = i.nextInt();
			
			try
			{
				res = a/b;
				System.out.println("Result is "+res);
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("Exception Cought: Division by Zero");
			}
			
			finally
			
			{
				i.close();
				System.out.println("Finally Block");
			}
		}
}
