import java.util.Scanner;

public class add 
{

public static void main(String[] args)
{
System.out.println("Input the first Number:");
Scanner scan = new Scanner(System.in);
int num1 = scan.nextInt();
System.out.println("Input the second Number:");
int num2 = scan.nextInt();
int num3 = num1 + num2;
System.out.println("The Result is:" + num3);
}
}