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
    //buttons init
    private JButton jButtonOk = new JButton("Ok");
    private JButton jButtonCancel = new JButton("Cancel");
    private JButton jButtonCencelSalary = new JButton("Cancel");
    private JButton jButtonOkSalary = new JButton("Ok");
    private JButton jButtonBackSalary = new JButton("Back");
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
    private JPanel registrationPanel = new JPanel();
    private JFrame registrationFrame = new JFrame();
    private JPanel salariedEmployeePanel = new JPanel();
    //constructor
    public EmployeeFrame (){
        registrationFrame.setVisible(true);

        registrationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        registrationFrame.setLocationRelativeTo(null);
    initRegistrationFrame();
    salariedEmployeeFrame();
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


private void initRegistrationFrame(){

    jRadioButtonBasedSalaried.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButtonSalary.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButtonHourly.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButtonCommission.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

    GroupLayout layoutRegistration = new GroupLayout(registrationPanel);
    registrationPanel.setLayout(layoutRegistration);

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
private void salariedEmployeeFrame(){
        registrationFrame.remove(registrationPanel);
        registrationFrame.add(salariedEmployeePanel);
        GroupLayout salariedLayout = new GroupLayout(salariedEmployeePanel);
        registrationPanel.setLayout(salariedLayout);

        salariedLayout.setAutoCreateGaps(true);
        salariedLayout.setAutoCreateContainerGaps(true);

        salariedLayout.setHorizontalGroup(salariedLayout.createSequentialGroup()
        .addGroup(salariedLayout.createParallelGroup(LEADING)
            .addComponent(jLabelWeeklySalary))
                .addGroup(salariedLayout.createParallelGroup(LEADING)
                .addComponent(jTextFieldWeeklySalary))
        );


        salariedLayout.setVerticalGroup(salariedLayout.createSequentialGroup()
        .addGroup(salariedLayout.createParallelGroup(BASELINE)
        .addComponent(jLabelWeeklySalary)
        .addComponent(jTextFieldWeeklySalary)
                .addGroup(salariedLayout.createSequentialGroup()
                        .addGroup(salariedLayout.createParallelGroup(LEADING)
                                .addComponent(jButtonCencelSalary)
                                .addComponent(jButtonCencelSalary)
                                .addComponent(jButtonOkSalary)
                        )))
        );


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
