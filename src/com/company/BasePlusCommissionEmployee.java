package com.company;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    protected double baseSalary;
    protected double rewardRate;

    public BasePlusCommissionEmployee(String theName, String theLastName, double theGrossSales, String theSsn,
                                      double theCommissionRate, Date theBirthday,double baseSalary, double rewardRate) {
        super(theName,theLastName,theGrossSales,theSsn,theCommissionRate,theBirthday);
        this.baseSalary = baseSalary;
        this.rewardRate = rewardRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getRewardRate() {
        return rewardRate;
    }

    public void setRewardRate(double rewardRate) {
        this.rewardRate = rewardRate;
    }
    //earnings
    @Override
    public double earnings()
    {
        return getBaseSalary()+ super.earnings() + getBaseSalary()*getRewardRate();
    }
    //toString
    @Override
    public String toString()
    {
        return String.format("name:%s, lastname:%s, ssn:%s, gross sales: %s, base salary: %s, reward rate:%s)",
        getName(),getLastname(),getSocialSecurityNumber(),getGrossSales(),getBaseSalary(),getRewardRate());
    }

}
