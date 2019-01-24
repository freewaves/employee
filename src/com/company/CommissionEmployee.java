package com.company;

public class CommissionEmployee extends Employee {
    protected double commissionRate;
    //constructor
    public CommissionEmployee(String theName, String theLastName, double theGrossSales, String theSsn,
                              double theCommissionRate, Date theBirthday)
    {
        super(theName,theLastName,theGrossSales,theSsn,theBirthday);
        this.commissionRate=theCommissionRate;
    }
    //getters setters

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    //methods
    @Override
    public double earnings()
    {
     return getGrossSales()*getCommissionRate();
    }
    //toString
    @Override
    public String toString()
    {
       return String.format("name:%s,lastname:%s, gross sales:%s, ssn:%s, commission rate:%s",getName(),
               getLastname(), getGrossSales(),getSocialSecurityNumber(),getCommissionRate()) ;
    }
}
