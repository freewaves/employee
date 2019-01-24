package com.company;
import java.lang.String;

public abstract class Employee extends Object {
    //instance vars
    protected String name;
    protected String lastName;
    protected double grossSales;
    protected String socialSecurityNumber;
    protected Date birthday;


    //constructor

    public Employee(String theName, String theLastName, double theGrossSales, String theSsn, Date theBirthday) {
        this.name = theName;
        this.lastName = theLastName;
        this.grossSales = theGrossSales;
        this.socialSecurityNumber = theSsn;
        this.birthday=theBirthday;
    }
    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public void setBirthday(Date birthday)
    {
        this.birthday=birthday;
    }

    //getters

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastName;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public Date getBirthday()
    {
        return birthday;
    }
//toString method
@Override
    public String toString()
    {
        return String.format( "%s: %s",

                "commission employee", getName());


    }
    //abstract method earnings
    public abstract double earnings();// no implementation


}
