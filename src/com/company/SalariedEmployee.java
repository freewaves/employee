package com.company;

public class SalariedEmployee extends Employee {
    //instance var
    protected double weeklySalary;

    public SalariedEmployee(String theName, String theLastName, double theGrossSales, String theSsn,
                            double theWeeklySalary, Date theBirthday) {
        super(theName, theLastName, theGrossSales, theSsn, theBirthday);
        this.weeklySalary = theWeeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary * 4;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    // earnings
    @Override
    public double earnings() {
        return getWeeklySalary();
    }
    //toString
    @Override
    public String toString()
    {
       return String.format("name:%s,lastname:%s,ssn:%s, gross sales:%s, weeklySalary:%s",
                getName(),getLastname(),getSocialSecurityNumber(),getGrossSales(),getWeeklySalary());
    }
}
