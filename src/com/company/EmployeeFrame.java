package com.company;

import javax.swing.*;

import static javax.swing.GroupLayout.Alignment.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
    //buttons init
    private JButton jButtonOk = new JButton("Ok");
    private JButton jButtonCancel = new JButton("Cancel");
    private JButton jButtonFinish = new JButton("Finish");
    private JButton jButtonBack = new JButton("Back");
    //radio buttons init
    private JRadioButton jRadioButtonSalary = new JRadioButton("Salary Employee");
    private JRadioButton jRadioButtonCommission = new JRadioButton("Commission Employee");
    private JRadioButton jRadioButtonBasedSalaried = new JRadioButton("Based & Salaied Employee");
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

    private JPanel registrationPanel = new JPanel();
    private JPanel commissionEmployeePanel = new JPanel();
    private JPanel salariedEmployeePanel = new JPanel();
    private JPanel hourlyEmployeePanel = new JPanel();
    private JFrame registrationFrame = new JFrame();


    //constructor
    public EmployeeFrame (){

    initRegistrationFrame();
//    initSalariedEmployeeFrame();
//    initHourlyEmployeeFrame();
//    initCommissionEmployeeFrame();
        registrationFrame.setVisible(true);
        registrationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        registrationFrame.setLocationRelativeTo(null);
        registrationFrame.setResizable(false);
        registrationFrame.pack();
    //registrationFrame

        //END registrationFrame

//handler registration
    TextFieldHandler handler = new TextFieldHandler();
    jTextFieldName.addActionListener(handler);
    jTextFieldLastName.addActionListener(handler);
    jTextFieldSocialSecurityNumber.addActionListener(handler);
    jTextFieldDateOfBirth.addActionListener(handler);
    jTextFieldGrossSales.addActionListener(handler);
    }
    //end EmployeeFrame constructor
    private void  buttonOk(ActionEvent e){
        if (jRadioButtonBasedSalaried.isSelected()){
            initSalariedEmployeeFrame();
        }
        if (jRadioButtonCommission.isSelected()){
            initCommissionEmployeeFrame();
        }
        if (jRadioButtonHourly.isSelected()){
            initHourlyEmployeeFrame();
        }
        if (jRadioButtonSalary.isSelected()){
            initSalariedEmployeeFrame();
        }
    }

private void initRegistrationFrame(){

    jRadioButtonBasedSalaried.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButtonSalary.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButtonHourly.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButtonCommission.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

    GroupLayout layoutRegistration = new GroupLayout(registrationPanel);
    registrationPanel.setLayout(layoutRegistration);

    layoutRegistration.setAutoCreateGaps(true);
    layoutRegistration.setAutoCreateContainerGaps(true);

    jButtonOk.addActionListener(this::buttonOk);

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
                    .addComponent(jTextFieldDateOfBirth)
                    .addComponent(jTextFieldGrossSales)
                    .addGroup(layoutRegistration.createSequentialGroup()
                            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                                    .addComponent(jRadioButtonBasedSalaried)
                                    .addComponent(jRadioButtonCommission))
                            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                                    .addComponent(jRadioButtonHourly)
                                    .addComponent(jRadioButtonSalary)))

                    .addGroup(layoutRegistration.createSequentialGroup()
                            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                                    .addComponent(jButtonOk))
                            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                                    .addComponent(jButtonCancel)))
            )
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
                    .addComponent(jTextFieldDateOfBirth))
            .addGroup(layoutRegistration.createParallelGroup()
                    .addComponent(jLabelGrossSales)
                    .addComponent(jTextFieldGrossSales))

            .addGroup(layoutRegistration.createParallelGroup(LEADING)
                    .addGroup(layoutRegistration.createSequentialGroup()
                            .addGroup(layoutRegistration.createParallelGroup(BASELINE)
                                    .addComponent(jRadioButtonBasedSalaried)
                                    .addComponent(jRadioButtonHourly))
                            .addGroup(layoutRegistration.createParallelGroup(BASELINE)
                                    .addComponent(jRadioButtonCommission)
                                    .addComponent(jRadioButtonSalary))))

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
    buttonGroupRadio.add(jRadioButtonBasedSalaried);
    buttonGroupRadio.add(jRadioButtonCommission);
    buttonGroupRadio.add(jRadioButtonHourly);
    buttonGroupRadio.add(jRadioButtonSalary);
    //END
    registrationFrame.add(registrationPanel);
}

private void initSalariedEmployeeFrame(){
        JFrame salariedFrame = new JFrame();
    GroupLayout salariedLayout = new GroupLayout(salariedEmployeePanel);
    salariedEmployeePanel.setLayout(salariedLayout);

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
    salariedFrame.add(salariedEmployeePanel);
    salariedFrame.pack();
}

    private void initHourlyEmployeeFrame(){
        JFrame hourlyFrame = new JFrame();
        GroupLayout hourlyLayout = new GroupLayout(hourlyEmployeePanel);
        hourlyEmployeePanel.setLayout(hourlyLayout);

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
        hourlyFrame.add(salariedEmployeePanel);
        hourlyFrame.add(hourlyEmployeePanel);
        hourlyFrame.pack();
    }
    private void initCommissionEmployeeFrame(){
        JFrame commissionFrame = new JFrame();
        GroupLayout commissionLayout = new GroupLayout(commissionEmployeePanel);
        commissionEmployeePanel.setLayout(commissionLayout);

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
        commissionFrame.add(salariedEmployeePanel);
        commissionFrame.add(commissionEmployeePanel);
        commissionFrame.pack();
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
}
