
public class StaticDemo {
	
	  static int count;
	StaticDemo()
	{
		count = count +1;
	}
	
	 void display()
	{
		System.out.println("The No of Objects Created is:" + count);
	}
	public static void main(String[] args)
	{
		StaticDemo s1 = new StaticDemo();
		s1.display();
		StaticDemo s3 = new StaticDemo();
		s3.display();
		StaticDemo s2 = new StaticDemo();
		s2.display();
		
	}

}
