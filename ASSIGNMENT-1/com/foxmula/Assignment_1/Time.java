package com.foxmula.Assignment_1;

public class Time {
    private int hour,min,sec;
    Time(int hr,int mi,int se)
    {
        hour=hr;
        min=mi;
        sec=se;
    }
    Time()
    {
        hour=0;
        min=0;
        sec=0;
    }
    public Time add(Time a)
    {
        Time t=new Time();
        t.sec=this.sec+a.sec;
        if(t.sec>60)
        {
            t.sec-=60;
            t.min++;
        }
        t.min+=this.min+a.min;
        if(t.min>60)
        {
            t.min-=60;
            t.hour++;
        }
        t.hour+=this.hour+a.hour;
        if(t.hour>24)
        {
            t.hour-=24;
        }
        return t;
    }
    void display(String st)
    {
        System.out.println(st+" "+hour+":"+min+":"+sec);
    }
    public static void main(String[] args)
    {
        Time t1=new Time(4,10,40);
        Time t2=new Time(3,23,30);
        Time t3=t1.add(t2);
        t1.display("Time 1: ");
        t2.display("Time 1: ");
        t3.display("Time after addition : ");
    }
}
