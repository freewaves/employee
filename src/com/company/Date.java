package com.company;

public class Date {
    //instant vars

    //month
    protected int month;
    //day
    protected int day;
    //year
    protected int year;
    //daysPerMonth
    public static final int[] daysPerMonth= {0, 31, 28, 31,
            30, 31, 30,31,31,30,31,30,31};
    //constructor
    public Date( int theMonth,int theDay, int theYear)
    {

     this.month =checkMonth(theMonth);
     this.day=checkDay(theDay);
     this.year= checkYear(theYear);
    }
    public int checkYear(int testYear)//checkYear
    {
        if (testYear>0)
        {
            return testYear;
        }
        else
            throw new IllegalArgumentException("year should be larger than 0");
    }

    public int checkMonth(int testMonth) //checkMonth
    {
     if (testMonth>=0&&testMonth<=12)
     {
         return testMonth;
     }
     else
         throw new IllegalArgumentException("month should be 1 to 12");
    }
    //checkday
    public int checkDay(int testDay )
    {
     if (testDay>0&&testDay<=daysPerMonth[month])
     {
        return testDay;
     }
     else throw new IllegalArgumentException("invalid value of day");
    }

    //encapsulation

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //display date
    public void displayDate(int theDay, int theMonth, int theYear)
    {
        System.out.println("Date:"+getDay()+"/"+getMonth()+"/"+getYear());
    }
    //toString
    @Override
    public String toString()
    {
        return String.format("%,%,%",day,month,year);
    }



}
