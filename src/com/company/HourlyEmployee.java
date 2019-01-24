package com.company;

public class HourlyEmployee extends Employee {
    protected double wage;
    protected int hoursWorked;

    public HourlyEmployee(String theName, String theLastName, double theGrossSales, String theSsn,
                          Date theBirthday, double wage, int hoursWorked) {
        super(theName, theLastName, theGrossSales, theSsn, theBirthday);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }


        public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    //overtimeSalary if hoursworked=
    public double overtimeSalary(int hoursWorked, double wage)
    {
        if (hoursWorked>40)
        {
            return (hoursWorked-40)*wage* 1.5;
        }
        else {
            return 0;
        }

    }
    //earnings
    @Override
    public double earnings()
    {
        return getWage()*getHoursWorked()+ overtimeSalary(getHoursWorked(),getWage());
    }

    //toString
    @Override
    public String toString()
    {
       return String.format("Name:%s, Last name:%s, ssn:%s, gross sales: %s, wage: %s, hours worked: %s, over time salary: %s", getName(),getLastname(),getSocialSecurityNumber(),
                getGrossSales(),getWage(),getHoursWorked(),overtimeSalary(hoursWorked,wage));

    }
}
