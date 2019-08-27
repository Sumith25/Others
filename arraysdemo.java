import java.util.Scanner;
class arraysdemo
{
public static void main(String[] args)
{
int n,i;
Scanner s = new Scanner(System.in);
System.out.println("Enter the size: ");
n=s.nextInt();
int nums[] = new int[n];
System.out.println("Enter the Array Elements:");
for(i=0;i<n;i++)
{
nums[i] = s.nextInt();
}
System.out.println("Number of elements in the Array:" + nums.length);
System.out.println("First Element of the Array is" + nums[0]);
System.out.println("Last Element of the Array is:" + nums[nums.length - 1]);

System.out.println("*************************************************");
System.out.println("The Array contents are :");
for(int j : nums)
System.out.print(j+" ");
}
}