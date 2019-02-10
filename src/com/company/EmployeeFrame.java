package com.company;

import javax.swing.*;

import static javax.swing.GroupLayout.Alignment.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;


public class EmployeeFrame {
    //labels init
    private JLabel jLabelName = new JLabel("Name :");
    private JLabel jLabelLastName = new JLabel("Last Name :");
    private JLabel jLabelSSN = new JLabel("SSN :");
    private JLabel jLabelDateOfBirth = new JLabel("Date Of Birth :");
    private JLabel jLabelGrossSales = new JLabel("Gross Sales :");
    private JLabel jLabelWeeklySalary = new JLabel("Weekly Salary");
    private JLabel jLabelWageHourly = new JLabel("Wage");
    private JLabel jLabelOvertimeRateHourly = new JLabel("Overtime Rate");
    private JLabel jLabelHoursWorkedHourly = new JLabel("Hourly Worked");
    private JLabel jLabel40Hours = new JLabel("By default , base hours ber week are 40 hours");
    private JLabel jLabelCommission = new JLabel("Commission Rate");
    private JLabel jLabelBaseCommissionRate = new JLabel("Commission Rate");
    private JLabel jLabelBaseCommissionReward = new JLabel("Reward Rate");
    private JLabel jLabelBaseCommissionSalary = new JLabel("Base Salary");
    //buttons init
    private JButton jButtonOk = new JButton("Ok");
    private JButton jButtonCancel = new JButton("Cancel");
    private JButton jButtonFinish = new JButton("Finish");
    private JButton jButtonBack = new JButton("Back");
    private JButton jButtonRegistration = new JButton("Registration");
    private JButton jButtonTable = new JButton("Table");
    //radio buttons init
    private JRadioButton jRadioButtonBaseCommission = new JRadioButton("Base Commission Employee");
    private JRadioButton jRadioButtonCommission = new JRadioButton("Commission Employee");
    private JRadioButton jRadioButtonSalaried = new JRadioButton("Salary Employee");
    private JRadioButton jRadioButtonHourly = new JRadioButton("Hourly Employee");
    // text fields init
    private JTextField jTextFieldName = new JTextField(15);
    private JTextField jTextFieldLastName = new JTextField(15);
    private JTextField jTextFieldSocialSecurityNumber = new JTextField(15);
    private JTextField jTextFieldDateOfBirth = new JTextField(15);
    private JTextField jTextFieldGrossSales = new JTextField(15);
    private JTextField jTextFieldWeeklySalary = new JTextField(15);
    private JTextField jTextFieldWageHourly = new JTextField(15);
    private JTextField jTextFieldOvertimeRateHourly = new JTextField(15);
    private JTextField jTextFieldHoursWorkedHourly = new JTextField(15);
    private JTextField jTextFieldCommissionRate = new JTextField(15);
    private JTextField jTextFieldBaseCommissionRate = new JTextField(15);
    private JTextField jTextFieldBaseRewardRate = new JTextField(15);
    private JTextField jTextFieldBaseSalary = new JTextField(15);
    //Frame
    private JFrame registrationFrame = new JFrame();
    private JFrame salariedFrame = new JFrame();
    private JFrame hourlyFrame = new JFrame();
    private JFrame commissionFrame = new JFrame();
    private JFrame baseCommissionFrame = new JFrame();
    private JFrame loginFrame = new JFrame();
    //combobox
    private JComboBox dayComboBox ;
    private JComboBox monthComboBox;
    private JComboBox yearComboBox;
    //combobox values
    private static final String[] monthsCombo={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC" };
    private static final String  [] yearsCombo = {"1997","1996","1995","1994","1993","1992","1991","1990","1989","1988","1987","1986","1985","1984","1983","1982","1981","1980","1979","1978","1977","1976","1975","1974","1973","1972","1971","1970",};
    private static final String[]dayCombo = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private JLabel labelMonthComboBox;
    //constructor
    public EmployeeFrame (){

//        initTableEmployee();
//    initRegistrationFrame();
    initLoginFrame();

//handler registration
    TextFieldHandler handler = new TextFieldHandler();
    jTextFieldName.addActionListener(handler);
    jTextFieldLastName.addActionListener(handler);
    jTextFieldSocialSecurityNumber.addActionListener(handler);
    jTextFieldDateOfBirth.addActionListener(handler);
    jTextFieldGrossSales.addActionListener(handler);

    //button handler registration
        ButtonHandler buttonHandler = new ButtonHandler();
        jButtonFinish.addActionListener(buttonHandler);


        //comboBox init
        dayComboBox = new JComboBox(dayCombo);
        yearComboBox = new JComboBox(yearsCombo);
        monthComboBox= new JComboBox(monthsCombo);
        monthComboBox.setMaximumRowCount(10);
        monthComboBox.addActionListener(
                //anonymous class
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        int numMonth =0;
                        for (int i = 1 ; i<=monthComboBox.getSelectedIndex();++i){
                            numMonth = i+1;
                        }
                        System.out.println(numMonth);
                        System.out.println(yearComboBox.getSelectedItem());
                        System.out.println(dayComboBox.getSelectedItem());
                    }
                });
    }
    //end EmployeeFrame constructor
    private void  buttonOk(ActionEvent e){
        if (jRadioButtonSalaried.isSelected()){
            initSalariedEmployeeFrame();
        }
        if (jRadioButtonCommission.isSelected()){
            initCommissionEmployeeFrame();
        }
        if (jRadioButtonHourly.isSelected()){
            initHourlyEmployeeFrame();
        }
        if (jRadioButtonBaseCommission.isSelected()){
            initBaseCommissionFrame();
        }
    }
    private void buttonBack(ActionEvent e){
       registrationFrame.setVisible(true);
       if (jRadioButtonSalaried.isSelected()){
           salariedFrame.repaint();
           salariedFrame.dispose();
       }
       if (jRadioButtonCommission.isSelected()){
           commissionFrame.repaint();
           commissionFrame.dispose();
       }
       if (jRadioButtonHourly.isSelected()){
           registrationFrame.repaint();
           hourlyFrame.dispose();
       }
       if (jRadioButtonBaseCommission.isSelected()){
           baseCommissionFrame.repaint();
           baseCommissionFrame.dispose();
       }
    }
    //registrationFrame
private void initRegistrationFrame(){

    jButtonOk.addActionListener(this::buttonOk);
    jButtonBack.addActionListener(this::buttonBack);
    jRadioButtonSalaried.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButtonBaseCommission.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButtonHourly.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButtonCommission.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

    GroupLayout layoutRegistration = new GroupLayout(registrationFrame.getContentPane());
    registrationFrame.getContentPane().setLayout(layoutRegistration);

    layoutRegistration.setAutoCreateGaps(true);
    layoutRegistration.setAutoCreateContainerGaps(true);
    // layoutRegistration start
    layoutRegistration.setHorizontalGroup(layoutRegistration.createSequentialGroup()
            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                    .addComponent(jLabelName)
                    .addComponent(jLabelLastName)
                    .addComponent(jLabelSSN)
                    .addComponent(jLabelDateOfBirth)
                    .addComponent(jLabelGrossSales))
            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                    .addComponent(jTextFieldName)
                    .addComponent(jTextFieldLastName)
                    .addComponent(jTextFieldSocialSecurityNumber)

                    .addGroup(layoutRegistration.createSequentialGroup()
                    .addGroup(layoutRegistration.createParallelGroup(LEADING)
                            .addComponent(dayComboBox))
                            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                                    .addComponent(monthComboBox))
                            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                                    .addComponent(yearComboBox)))


                    .addComponent(jTextFieldGrossSales)


                    .addGroup(layoutRegistration.createSequentialGroup()
                            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                                    .addComponent(jRadioButtonSalaried)
                                    .addComponent(jRadioButtonCommission))
                            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                                    .addComponent(jRadioButtonHourly)
                                    .addComponent(jRadioButtonBaseCommission)))

                    .addGroup(layoutRegistration.createSequentialGroup()
                            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                                    .addComponent(jButtonOk))
                            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                                    .addComponent(jButtonCancel))))
                    );

    layoutRegistration.setVerticalGroup(layoutRegistration.createSequentialGroup()
            .addGroup(layoutRegistration.createParallelGroup(BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName))
            .addGroup(layoutRegistration.createParallelGroup()
                    .addComponent(jLabelLastName)
                    .addComponent(jTextFieldLastName))
            .addGroup(layoutRegistration.createParallelGroup()
                    .addComponent(jLabelSSN)
                    .addComponent(jTextFieldSocialSecurityNumber))
            .addGroup(layoutRegistration.createParallelGroup()
                    .addComponent(jLabelDateOfBirth)
                    .addGroup(layoutRegistration.createParallelGroup(LEADING)
                    .addGroup(layoutRegistration.createSequentialGroup()
                            .addGroup(layoutRegistration.createParallelGroup(BASELINE)
                            .addComponent(dayComboBox)
                            .addComponent(monthComboBox)
                            .addComponent(yearComboBox)))))
            .addGroup(layoutRegistration.createParallelGroup()
                    .addComponent(jLabelGrossSales)
                    .addComponent(jTextFieldGrossSales))

            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                    .addGroup(layoutRegistration.createSequentialGroup()
                            .addGroup(layoutRegistration.createParallelGroup(BASELINE)
                                    .addComponent(jRadioButtonSalaried)
                                    .addComponent(jRadioButtonHourly))
                            .addGroup(layoutRegistration.createParallelGroup(BASELINE)
                                    .addComponent(jRadioButtonCommission)
                                    .addComponent(jRadioButtonBaseCommission))))

            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                    .addGroup(layoutRegistration.createParallelGroup()
                            .addGroup(layoutRegistration.createParallelGroup(BASELINE))
                            .addComponent(jButtonOk))
                    .addGroup(layoutRegistration.createParallelGroup()
                            .addComponent(jButtonCancel)))

    );
    //layoutRegistration END

    //Added JButtonGroup RadioButton
    ButtonGroup buttonGroupRadio = new ButtonGroup();
    buttonGroupRadio.add(jRadioButtonSalaried);
    buttonGroupRadio.add(jRadioButtonCommission);
    buttonGroupRadio.add(jRadioButtonHourly);
    buttonGroupRadio.add(jRadioButtonBaseCommission);
    //END
    registrationFrame.setVisible(true);
    registrationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    registrationFrame.setLocationRelativeTo(null);
    registrationFrame.setResizable(false);
    registrationFrame.pack();
    //END registrationFrame
}

private void initSalariedEmployeeFrame(){


    GroupLayout salariedLayout = new GroupLayout(salariedFrame.getContentPane());
    salariedFrame.getContentPane().setLayout(salariedLayout);

    salariedLayout.setAutoCreateGaps(true);
    salariedLayout.setAutoCreateContainerGaps(true);

    // salariedLayout start
    salariedLayout.setHorizontalGroup(salariedLayout.createSequentialGroup()
            .addGroup(salariedLayout.createParallelGroup(LEADING)
                    .addComponent(jLabelWeeklySalary))
            .addGroup(salariedLayout.createParallelGroup(LEADING)
                    .addComponent(jTextFieldWeeklySalary)

                    .addGroup(salariedLayout.createSequentialGroup()
                            .addGroup(salariedLayout.createParallelGroup(LEADING)
                                    .addComponent(jButtonFinish))
                            .addGroup(salariedLayout.createParallelGroup(LEADING)
                                    .addComponent(jButtonCancel))
                            .addGroup(salariedLayout.createParallelGroup(LEADING)
                                    .addComponent(jButtonBack)))
            )
    );
    salariedLayout.setVerticalGroup(salariedLayout.createSequentialGroup()
            .addGroup(salariedLayout.createParallelGroup(BASELINE)
                    .addComponent(jLabelWeeklySalary)
                    .addComponent(jTextFieldWeeklySalary))


            .addGroup(salariedLayout.createParallelGroup(LEADING)
                    .addGroup(salariedLayout.createParallelGroup()
                            .addGroup(salariedLayout.createParallelGroup(BASELINE))
                            .addComponent(jButtonFinish))
                    .addGroup(salariedLayout.createParallelGroup()
                            .addComponent(jButtonCancel))
                    .addGroup(salariedLayout.createParallelGroup()
                            .addComponent(jButtonBack)))

    );
    //salariedLayout END


    registrationFrame.setVisible(false);
    salariedFrame.setVisible(true);
    salariedFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    salariedFrame.setLocationRelativeTo(null);
    salariedFrame.setResizable(false);
    salariedFrame.pack();
}

    public void initHourlyEmployeeFrame(){


        GroupLayout hourlyLayout = new GroupLayout(hourlyFrame.getContentPane());
        hourlyFrame.getContentPane().setLayout(hourlyLayout);

        hourlyLayout.setAutoCreateGaps(true);
        hourlyLayout.setAutoCreateContainerGaps(true);

        hourlyLayout.setHorizontalGroup(hourlyLayout.createSequentialGroup()
                .addGroup(hourlyLayout.createParallelGroup(LEADING)
                        .addComponent(jLabelWageHourly)
                        .addComponent(jLabelOvertimeRateHourly)
                        .addComponent(jLabelHoursWorkedHourly))
                .addGroup(hourlyLayout.createParallelGroup(LEADING)
                        .addComponent(jTextFieldWageHourly)
                        .addComponent(jTextFieldOvertimeRateHourly)
                        .addComponent(jTextFieldHoursWorkedHourly)
                        .addGroup(hourlyLayout.createSequentialGroup()
                                .addGroup(hourlyLayout.createParallelGroup(LEADING)
                                        .addComponent(jLabel40Hours)))

                        .addGroup(hourlyLayout.createSequentialGroup()
                                .addGroup(hourlyLayout.createParallelGroup(LEADING)
                                        .addComponent(jButtonFinish))
                                .addGroup(hourlyLayout.createParallelGroup(LEADING)
                                        .addComponent(jButtonBack))
                                .addGroup(hourlyLayout.createParallelGroup(LEADING)
                                        .addComponent(jButtonCancel)))
                )
        );
        hourlyLayout.setVerticalGroup(hourlyLayout.createSequentialGroup()
                .addGroup(hourlyLayout.createParallelGroup(BASELINE)
                        .addComponent(jLabelWageHourly)
                        .addComponent(jTextFieldWageHourly))
                .addGroup(hourlyLayout.createParallelGroup()
                        .addComponent(jLabelOvertimeRateHourly)
                        .addComponent(jTextFieldOvertimeRateHourly))
                .addGroup(hourlyLayout.createParallelGroup()
                        .addComponent(jLabelHoursWorkedHourly)
                        .addComponent(jTextFieldHoursWorkedHourly))

                .addGroup(hourlyLayout.createParallelGroup(LEADING)
                        .addGroup(hourlyLayout.createSequentialGroup()
                                .addGroup(hourlyLayout.createParallelGroup(BASELINE)
                                        .addComponent(jLabel40Hours))))

                .addGroup(hourlyLayout.createParallelGroup(LEADING)
                        .addGroup(hourlyLayout.createParallelGroup()
                                .addGroup(hourlyLayout.createParallelGroup(BASELINE))
                                .addComponent(jButtonFinish))
                        .addGroup(hourlyLayout.createParallelGroup()
                                .addComponent(jButtonCancel))
                        .addGroup(hourlyLayout.createParallelGroup()
                                .addComponent(jButtonBack)))

        );
        //hourlyLayout END
        registrationFrame.setVisible(false);
        hourlyFrame.setVisible(true);
        hourlyFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        hourlyFrame.setLocationRelativeTo(null);
        hourlyFrame.setResizable(false);
        hourlyFrame.pack();
    }
    private void initCommissionEmployeeFrame(){


        GroupLayout commissionLayout = new GroupLayout(commissionFrame.getContentPane());
        commissionFrame.getContentPane().setLayout(commissionLayout);

        commissionLayout.setAutoCreateGaps(true);
        commissionLayout.setAutoCreateContainerGaps(true);

        // commissionLayout start
        commissionLayout.setHorizontalGroup(commissionLayout.createSequentialGroup()
                .addGroup(commissionLayout.createParallelGroup(LEADING)
                        .addComponent(jLabelCommission))
                .addGroup(commissionLayout.createParallelGroup(LEADING)
                        .addComponent(jTextFieldCommissionRate)

                        .addGroup(commissionLayout.createSequentialGroup()
                                .addGroup(commissionLayout.createParallelGroup(LEADING)
                                        .addComponent(jButtonFinish))
                                .addGroup(commissionLayout.createParallelGroup(LEADING)
                                        .addComponent(jButtonCancel))
                                .addGroup(commissionLayout.createParallelGroup(LEADING)
                                        .addComponent(jButtonBack)))
                )
        );
        commissionLayout.setVerticalGroup(commissionLayout.createSequentialGroup()
                .addGroup(commissionLayout.createParallelGroup(BASELINE)
                        .addComponent(jLabelCommission)
                        .addComponent(jTextFieldCommissionRate))


                .addGroup(commissionLayout.createParallelGroup(LEADING)
                        .addGroup(commissionLayout.createParallelGroup()
                                .addGroup(commissionLayout.createParallelGroup(BASELINE))
                                .addComponent(jButtonFinish))
                        .addGroup(commissionLayout.createParallelGroup()
                                .addComponent(jButtonCancel))
                        .addGroup(commissionLayout.createParallelGroup()
                                .addComponent(jButtonBack)))

        );
        //commissionLayout END
        registrationFrame.setVisible(false);
        commissionFrame.setVisible(true);
        commissionFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        commissionFrame.setLocationRelativeTo(null);
        commissionFrame.setResizable(false);
        commissionFrame.pack();
    }

private void initBaseCommissionFrame (){


    GroupLayout commissionLayout = new GroupLayout(baseCommissionFrame.getContentPane());
baseCommissionFrame.getContentPane().setLayout(commissionLayout);

    commissionLayout.setAutoCreateGaps(true);
    commissionLayout.setAutoCreateContainerGaps(true);

    commissionLayout.setHorizontalGroup(commissionLayout.createSequentialGroup()
            .addGroup(commissionLayout.createParallelGroup(LEADING)
                    .addComponent(jLabelBaseCommissionRate)
                    .addComponent(jLabelBaseCommissionReward)
                    .addComponent(jLabelBaseCommissionSalary))
            .addGroup(commissionLayout.createParallelGroup(LEADING)
                    .addComponent(jTextFieldBaseCommissionRate)
                    .addComponent(jTextFieldBaseRewardRate)
                    .addComponent(jTextFieldBaseSalary)


                    .addGroup(commissionLayout.createSequentialGroup()
                            .addGroup(commissionLayout.createParallelGroup(LEADING)
                                    .addComponent(jButtonFinish))
                            .addGroup(commissionLayout.createParallelGroup(LEADING)
                                    .addComponent(jButtonBack))
                            .addGroup(commissionLayout.createParallelGroup(LEADING)
                                    .addComponent(jButtonCancel)))
            )

    );
    commissionLayout.setVerticalGroup(commissionLayout.createSequentialGroup()
            .addGroup(commissionLayout.createParallelGroup(BASELINE)
                    .addComponent(jLabelBaseCommissionRate)
                    .addComponent(jTextFieldBaseCommissionRate))
            .addGroup(commissionLayout.createParallelGroup()
                    .addComponent(jLabelBaseCommissionReward)
                    .addComponent(jTextFieldBaseRewardRate))
            .addGroup(commissionLayout.createParallelGroup()
                    .addComponent(jLabelBaseCommissionSalary)
                    .addComponent(jTextFieldBaseSalary))

            .addGroup(commissionLayout.createParallelGroup(LEADING)
                    .addGroup(commissionLayout.createParallelGroup()
                            .addGroup(commissionLayout.createParallelGroup(BASELINE))
                            .addComponent(jButtonFinish))
                    .addGroup(commissionLayout.createParallelGroup()
                            .addComponent(jButtonCancel))
                    .addGroup(commissionLayout.createParallelGroup()
                            .addComponent(jButtonBack)))

    );

    registrationFrame.setVisible(false);
    baseCommissionFrame.setVisible(true);
    baseCommissionFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    baseCommissionFrame.setLocationRelativeTo(null);
    baseCommissionFrame.setResizable(false);
    baseCommissionFrame.pack();
}

    private void registrationButton(ActionEvent e){
        initRegistrationFrame();
        loginFrame.setVisible(false);
        loginFrame.dispose();
    }
    private void tableButton(ActionEvent e){
        TableFrame tableFrame = new TableFrame();
        tableFrame.initTableEmployee();
        loginFrame.setVisible(false);
        loginFrame.dispose();
    }
    private void initLoginFrame(){
        GroupLayout loginLayout = new GroupLayout(loginFrame.getContentPane());
        loginFrame.setLayout(loginLayout);
jButtonRegistration.addActionListener(this::registrationButton);
jButtonTable.addActionListener(this::tableButton);
        loginLayout.setAutoCreateGaps(true);
        loginLayout.setAutoCreateContainerGaps(true);

        // loginLayout start
        loginLayout.setHorizontalGroup(loginLayout.createSequentialGroup()
                .addGroup(loginLayout.createParallelGroup(LEADING)
                        .addComponent(jButtonRegistration))
                .addGroup(loginLayout.createParallelGroup(LEADING)
                        .addComponent(jButtonTable))
        );
        loginLayout.setVerticalGroup(loginLayout.createSequentialGroup()
                .addGroup(loginLayout.createParallelGroup(BASELINE)
                        .addComponent(jButtonRegistration)
                        .addComponent(jButtonTable))
        );
        //loginLayout END
        loginFrame.setVisible(true);
        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setResizable(false);

        loginFrame.pack();
    }
    // private inner class for event handling
    private class TextFieldHandler implements ActionListener {
        // process text field events
        public void actionPerformed(ActionEvent event) {
            String empName = ""; // declare string to display
            String empLast = "";
            String empSsn = "";
            double empSales = 0;

            // user pressed Enter in JTextFieldName
            if (event.getSource() == jTextFieldName)
                empName = event.getActionCommand();
            // user pressed Enter in JTextFieldLastName
            if (event.getSource() == jTextFieldLastName)
                empLast = event.getActionCommand();
            if (event.getSource() == jTextFieldSocialSecurityNumber)
                empSsn = event.getActionCommand();
            if (event.getSource() == jTextFieldGrossSales)
                empSales = Double.parseDouble(event.getActionCommand());
        }
    }
    //private inner class for button Finish
    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(salariedFrame.isVisible()==true)
            {

                Date birthday2= new Date(1,13,1997);
                ArrayList<SalariedEmployee> salariedEmployees= new ArrayList<SalariedEmployee>();
                SalariedEmployee salariedEmployee=new SalariedEmployee("Marisha","Maeva",2000,
                        "2930",500,birthday2);
                salariedEmployees.add(salariedEmployee);
            }
            else if (commissionFrame.isVisible() == true)
            {
                Date myBirthday= new Date(12,2,1989);
                ArrayList<CommissionEmployee> employees = new ArrayList <CommissionEmployee> ();
                CommissionEmployee comEmployee = new CommissionEmployee("Ann","Mist",
                        600,"278903",20,myBirthday);
                employees.add(comEmployee);

            }
            else if (baseCommissionFrame.isVisible()==true)
            {
                Date today =new Date(1,18,2019);
                ArrayList<BasePlusCommissionEmployee> basePlusCommissionEmployees = new ArrayList<BasePlusCommissionEmployee>();
                BasePlusCommissionEmployee basePlusCommissionEmployee= new BasePlusCommissionEmployee("Nathalie",
                        "Mall", 900,"8907",20,today,800,45);
                basePlusCommissionEmployees.add(basePlusCommissionEmployee);
            }
            else if(hourlyFrame.isVisible()==true)
            {
                Date today =new Date(1,18,2019);
                ArrayList<HourlyEmployee> hourlyEmployees=new ArrayList<HourlyEmployee>();
                HourlyEmployee hourlyEmployee= new HourlyEmployee("Bob","Ross",800,
                        "8590",today,12,45);
                hourlyEmployees.add(hourlyEmployee);
            }
        }
    }
}
