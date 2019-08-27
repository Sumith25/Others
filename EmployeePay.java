abstract class Employee
{
	String name;
	double basic;
	String address;
	
	Employee()
	{
}
	Employee(String str , double sal , String addr){
		name = str;
		basic = sal;
		address = addr;
	}
	
	void show()
	{
		System.out.println("Name:\t\t\t" + name);
		System.out.println("Address:\t\t\t" + address);
		System.out.println("Basic:\t\t\t" + basic);
	}
	abstract double totalPay();
	
	double deduction( int leave)
	{
		double lessPay;
		
		if(leave <= 5)
		lessPay = (.25 * basic);
		else
			lessPay = (.5*basic);
		
		return lessPay;
	}
}

class Manager extends Employee
{
	String department;
	Manager(){
		
	}
	Manager(String str , double sal , String addr , String dept){
		super(str,sal,addr);
		department = dept;
	}
	
	void show() {
		super.show();
		System.out.println("Department : \t\t\t" + department);
		
	}
	double totalPay()
	{
		double totalAmount = 0;
		double hra = (basic *0.08);
		double da = (basic * 0.3);
		double ma = 1500;
		totalAmount = basic + hra + da + ma;
		
		return totalAmount;
	}
}

class Director extends Employee
{
	double transport_Allowance;
	Director(){}
	Director(String str , double sal , String addr, double allowance)
	{
		super (str,sal,addr);
		transport_Allowance = allowance;
	}
	
	void show() {
		super.show();
		System.out.println("Department : \t\t\t" + transport_Allowance );
		
	}
	double totalPay()
	{
		double totalAmount = 0;
		double hra = (basic *0.20);
		double da = (basic * 0.5);
		double ma = 4500;
		double ea = 5000;
		double ta = transport_Allowance;
		totalAmount = basic + hra + da + ma + ea +ta;
		
		return totalAmount;
	}
}
class EmployeePay {
    EmployeePay() {
    }

     

    public static void main(String[] args) {
       Manager mgrObj = new Manager("Henry", 5500.65, "Sydney", "Accounts");
       double payTotal = mgrObj.totalPay();
       double less = mgrObj.deduction(5);
       double netPay = payTotal - less;
       System.out.println("\nManager Details");
       System.out.println("===================================");
       mgrObj.show();
       System.out.println("Total Pay: \t\t" + payTotal);
       System.out.println("Net Pay: \t\t" + netPay);
       Director dirObj = new Director("Stephen", 32400.00, "New York",
       8000);
       payTotal = dirObj.totalPay();
       less = dirObj.deduction(5);
       netPay = payTotal - less;
       System.out.println("\n\nDirector Details");
       System.out.println("============================");
       dirObj.show();
       System.out.println("Total Pay: \t\t" + payTotal);
       System.out.println("Net Pay: \t\t" + netPay);
    }
}

