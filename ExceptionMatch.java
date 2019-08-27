
public class ExceptionMatch {
public static void  main(String[] a)
{
	int num1=10;
	int num2=0;
	int res=0;
	int arr[] = new int[5];
	try {
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		arr[4]=4;
		//r[5]=5;
		
		res = num1/num2;
		System.out.println("Result of Division:"+res);
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("Err :Divided by zero");
		
	}
	//tch (ArrayIndexOutOfBoundException e)
//
	//ystem.out.println("Err:Array out of Bound");
//
}
}
