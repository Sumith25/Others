import java.util.Scanner;
class Student_Test
{

public static void main(String[] args)
{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the Number of Students:");
    int n = s.nextInt();
    Student obj[] = new Student[n];
    for(int i=0;i<n;i++)
    {
    obj[i] = new Student();
    obj[i].input();
    obj[i].calculate();
    obj[i].display();
    }
}
} 