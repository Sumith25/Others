import java.util.Scanner;

class Employee
{
int emp_id;
String emp_Name,dept;
float basic,hra,tax,total_Sal;

void input()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter Employee Id, Name ,Department and Basic Salary");
emp_id = s.nextInt();
emp_Name=s.next();
dept=s.next();
basic=s.nextFloat();
}
void calculate()
{
hra = basic*.10f;
tax = basic*.05f;
total_Sal = (basic+hra)-tax;
}
void display()
{
System.out.println("The Employee Details are:");
System.out.println("Employee_ID:" + emp_id);
System.out.println("Employee_Name:" + emp_Name);
System.out.println("Department:"+dept);
System.out.println("Total Salary:" + total_Sal);
}
}