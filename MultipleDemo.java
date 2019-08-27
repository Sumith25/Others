interface Exam
{
	void percent_cal();
}
class Student_
{
	String name;
	int roll_no,marks1,marks2;
	Student_(String n, int r , int m1 , int m2)
	{
		name = n;
		roll_no = r;
		marks1 = m1;
		marks2 =m2;
	}
	
	void display()
	{
		System.out.println("Name of Student_:"+name);
		System.out.println("Roll No of Student_:"+roll_no);
		System.out.println("Marks Subject 1:"+marks1);
		System.out.println("Marks subject 2:"+marks2);
		
	}
}
	
	class Result extends Student_ implements Exam
	{
		Result(String n , int r , int m1 , int m2)
		{
			super(n,r,m1,m2);
		}
		public void percent_cal()
		{
			int total = (marks1+marks2);
			float percent=total*100/200;
			System.out.println("Percentage:"+percent+"%");
		}
		void display()
		{
			super.display();
		}
	}
public class MultipleDemo {
	public static void main(String[] args)
	{
		Result r = new Result("John",12,93,84);
		r.display();
		r.percent_cal();
	}

}
