
public class ThrowExample {

	static void check(int stage , int sw)
	{
		if(stage<12 && sw<40)
		{
			throw new ArithmeticException("Student is not Eligible");
		}
		else
			System.out.println("Student is Eligible");
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Registration:");
		check(15,43);
		System.out.println("Have a nice Day..");
	}
}
