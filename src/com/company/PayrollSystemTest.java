/*
A company pays its employees on a weekly basis. The employees are of four types: Sala-
ried employees are paid a fixed weekly salary regardless of the number of hours worked,
hourly employees are paid by the hour and receive overtime pay (i.e., 1.5 times their
hourly salary rate) for all hours worked in excess of 40 hours, commission employees
are paid a percentage of their sales and base-salaried commission employees receive a
base salary plus a percentage of their sales. For the current pay period, the company has
decided to reward salaried-commission employees by adding 10% to their base sala-
ries. The company wants to write an application that performs its payroll calculations
polymorphically.
(Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include private
instance variable birthDate in class Employee . Use class Date of Fig. 8.7 to represent an em-
ployee’s birthday. Add get methods to class Date . Assume that payroll is processed once per month.
Create an array of Employee variables to store references to the various employee objects. In a loop,
calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
payroll amount if the current month is the one in which the Employee ’s birthday occurs.
*/
package com.company;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

import static javax.swing.GroupLayout.Alignment.*;

public class PayrollSystemTest extends JFrame {
    private JLabel jLabelName = new JLabel("Name :");
    private JLabel jLabelLastName = new JLabel("Last Name :");
    private JLabel jLabelSSN = new JLabel("SSN :");
    private JLabel jLabelDateOfBirth = new JLabel("Date Of Birth :");
    private JLabel jLabelGrossSales = new JLabel("Gross Sales :");
    private JButton jButtonOk = new JButton("Ok");
    private JButton jButtonCancel = new JButton("Cancel");
    private JRadioButton jRadioButtonSalary = new JRadioButton("Salary Employee");
    private JRadioButton jRadioButtonCommission = new JRadioButton("Commission Employee");
    private JRadioButton jRadioButtonBasedSalaried = new JRadioButton("Based & Salaied Employee");
    private JRadioButton jRadioButtonHourly = new JRadioButton("Hourly Employee");
    private JTextField jTextFieldName = new JTextField(15);
    private JTextField jTextFieldLastName = new JTextField(15);
    private JTextField jTextFieldSocialSecurityNumber = new JTextField(15);
    private JTextField jTextFieldDateOfBirth = new JTextField(15);
    private JTextField jTextFieldWeeklySalary = new JTextField(15);

    public PayrollSystemTest() {
        jRadioButtonBasedSalaried.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButtonSalary.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButtonHourly.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButtonCommission.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // layout start
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addComponent(jLabelName)
                .addComponent(jLabelLastName)
                .addComponent(jLabelSSN)
                .addComponent(jLabelDateOfBirth)
                .addComponent(jLabelGrossSales)
                .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(jTextFieldName)
                        .addComponent(jTextFieldLastName)
                        .addComponent(jTextFieldSocialSecurityNumber)
                        .addComponent(jTextFieldDateOfBirth)
                        .addComponent(jTextFieldWeeklySalary)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(LEADING)
                                        .addComponent(jRadioButtonBasedSalaried)
                                        .addComponent(jRadioButtonCommission))
                                .addGroup(layout.createParallelGroup(LEADING)
                                        .addComponent(jRadioButtonHourly)
                                        .addComponent(jRadioButtonSalary))))
                .addGroup(layout.createParallelGroup(LEADING)
                        .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonOk))
                        .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancel)))

        );


        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(jLabelName)
                        .addComponent(jTextFieldName))
                .addGroup(layout.createParallelGroup()
                        .addComponent(jLabelLastName)
                        .addComponent(jTextFieldLastName))
                .addGroup(layout.createParallelGroup()
                        .addComponent(jLabelSSN)
                        .addComponent(jTextFieldSocialSecurityNumber))
                .addGroup(layout.createParallelGroup()
                        .addComponent(jLabelDateOfBirth)
                        .addComponent(jTextFieldDateOfBirth))
                .addGroup(layout.createParallelGroup()
                        .addComponent(jLabelGrossSales)
                        .addComponent(jTextFieldWeeklySalary))

                .addGroup(layout.createParallelGroup(LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(BASELINE)
                                        .addComponent(jRadioButtonBasedSalaried)
                                        .addComponent(jRadioButtonHourly))
                                .addGroup(layout.createParallelGroup(BASELINE)
                                        .addComponent(jRadioButtonCommission)
                                        .addComponent(jRadioButtonSalary)))

                        )
                .addGroup(layout.createParallelGroup(LEADING)
                        .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonOk))
                        .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonCancel))))
        );
        //layout END

        //Added JButtonGroup RadioButton
        ButtonGroup buttonGroupRadio = new ButtonGroup();
        buttonGroupRadio.add(jRadioButtonBasedSalaried);
        buttonGroupRadio.add(jRadioButtonCommission);
        buttonGroupRadio.add(jRadioButtonHourly);
        buttonGroupRadio.add(jRadioButtonSalary);
        //END
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
                new PayrollSystemTest().setVisible(true);
            }
        });

        //salaried commission employees are rewarded 10%
        Date today =new Date(1,18,2019);
        Date myBirthday= new Date(12,2,1989);
        Date birthday2= new Date(1,13,1997);
        Scanner input =new Scanner(System.in);
        ArrayList<SalariedEmployee> salariedEmployees= new ArrayList<SalariedEmployee>();
        SalariedEmployee salariedEmployee=new SalariedEmployee("Marisha","Maeva",2000,
                "2930",500,birthday2);
        salariedEmployees.add(salariedEmployee);
        ArrayList<CommissionEmployee> employees = new ArrayList <CommissionEmployee> ();
        CommissionEmployee comEmployee = new CommissionEmployee("Ann","Mist",
                600,"278903",20,myBirthday);
        employees.add(comEmployee);
        ArrayList<BasePlusCommissionEmployee> basePlusCommissionEmployees = new ArrayList<BasePlusCommissionEmployee>();
        BasePlusCommissionEmployee basePlusCommissionEmployee= new BasePlusCommissionEmployee("Nathalie",
                "Mall", 900,"8907",20,today,800,45);
        basePlusCommissionEmployees.add(basePlusCommissionEmployee);
        ArrayList<HourlyEmployee> hourlyEmployees=new ArrayList<HourlyEmployee>();
        HourlyEmployee hourlyEmployee= new HourlyEmployee("Bob","Ross",800,
                "8590",today,12,45);
        hourlyEmployees.add(hourlyEmployee);

        System.out.println("choose employee type\n1 -salaried employee\n" +
                "2 -commission employee\n"+"3 -base+commission employee\n"+ "4 -hourly employee");
        int employeeType= input.nextInt();
        if(employeeType==2)
        {
            System.out.println("your balance:" + comEmployee.earnings());
            System.out.println(comEmployee.toString());
        }

        /*System.out.println(" commission employee name ");
        String empName=input.nextLine();
        comEmployee.setName(empName);
        System.out.println("your lastname");
        String empLast= input.nextLine();
        comEmployee.setLastName(empLast);
        System.out.println("your ssn");
        String empSsn=input.nextLine();
        comEmployee.setSocialSecurityNumber(empSsn);
        System.out.println("gross sales");
        double empSales=input.nextDouble();
        comEmployee.setGrossSales(empSales);
        System.out.println("Commission rate");
        double comRate= input.nextDouble();
        comEmployee.setCommissionRate(comRate);
        */
    }
    public void initPanelRegistration(){


    }
    private void initFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setTitle("Дикобраз");
//        setVisible(true);
//        pack();
        setLocationRelativeTo(null);
    }
}
