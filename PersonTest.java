import java.util.Scanner;
class Person
{
    private String name;
    private int age;
    private String consti;
    Scanner s;

Person()
{
    System.out.println("Voter Eligibility App");
    age = 0;
    name = "";
    consti = "Bengaluru";
    s = new Scanner(System.in);

}
Person(String n, int a)
{
    name = n;
    age = a;
}
Person(String n , int a , String c)
{
    name = n;
    age = a;
    consti = c;
}
public void input()
{
    System.out.println("Enter your Name:");
    name = s.next();
    System.out.println("Enter Your Age:");
    age =  s.nextInt();
}

public void print()
{
    System.out.println("Name is "+ name);
    System.out.println("Age is "+age);
    System.out.println("Constituency is "+ consti);
}
}
class PersonTest
{
    public static void main(String[] args)
    {
        Person obj = new Person();
        Person obj1 = new Person("Raj",30);
        Person obj2 = new Person("Mike",50,"Delhi");

        obj.input();
        obj.print();

        obj1.print();

        obj2.print();
    }
}