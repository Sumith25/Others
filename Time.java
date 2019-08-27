class Time 
{
    int hours,mins,sec;

    public Time(int h,int m,int s)
    {
        hours = h;
        mins = m;
        sec = s;

    }

    void add(Time obj2)
    {
        this.hours += obj2.hours;
        this.mins += obj2.mins;
        this.sec += obj2.sec;

        if(this.mins > 60)
        {
            this.mins= this.mins - 60;
            this.hours = this.hours +1;
            
        }
        if(this.sec > 60 )
        {
            this.sec = this.sec - 60;
            this.mins = this.mins + 1;
        }
    }

    void display()
    {
        System.out.println(this.hours+":"+this.mins+":"+this.sec);
    }

    public static void main(String[] args)
    {
        Time obj1 = new Time(12,45,30);
        Time obj2 = new Time(2,30,25);

        obj1.add(obj2);
        System.out.println("The addition of the  Time is :");
        obj1.display();
    }
}