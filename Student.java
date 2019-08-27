import java.util.Scanner;

public class Student
{
    int roll_No,marks1,marks2,marks3,marks4,marks5;
    String s_Name,dept,res;
    int avg_marks =0;

    int input()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Roll No, Name , Department_Name , Marks of all 5 subjects:");
        roll_No = s.nextInt();
        s_Name=s.next();
        dept=s.next();
        marks1=s.nextInt();
        marks2=s.nextInt();
        marks3=s.nextInt();
        marks4=s.nextInt();
        marks5=s.nextInt();

        return n;
    }

    String calculate()
    {
        avg_marks = (marks1+marks2+marks3+marks4+marks5)/5;
        System.out.println("Average Marks:"+avg_marks);

        if(avg_marks>=70 && avg_marks<=100)
            res =  "FCD";
        else if(avg_marks<70 && avg_marks > 60)
            res = "FC";
        else if(avg_marks < 60 && avg_marks > 50)
            res="SC";
        else if(avg_marks < 50 && avg_marks > 40)
            res= "Pass";
        else
                res= "Fail";

        return res;
    }

    void display()
{
System.out.println("The Student Details are:");
System.out.println("Roll_No:" + roll_No);
System.out.println("Student Name:" + s_Name);
System.out.println("Department:"+dept);
System.out.println("Result:"+res);
}

}