class Employee1
{
    int id;
    String name;

    Employee1()
    {
        System.out.println("Employee Constructor");
    }
}
    class Devoloper extends Employee1
    {
        String skills;

        Devoloper()
        {
            super();
            System.out.println("Devoloper Constructor()");
        }

        public static void main(String[] args)
        {
            Employee1 e1 = new Employee1();
            Devoloper d1 = new Devoloper();
        }
    }