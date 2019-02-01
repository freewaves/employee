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
    //buttons init
    private JButton jButtonOk = new JButton("Ok");
    private JButton jButtonCancel = new JButton("Cancel");
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
    private JPanel registrationPanel = new JPanel();
    private JFrame registrationFrame = new JFrame();
    //constructor
    public EmployeeFrame (){
    initRegistrationFrame(); 
    //registrationFrame
        registrationFrame.add(registrationPanel);
        registrationFrame.setVisible(true);
        registrationFrame.pack();
        registrationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        registrationFrame.setLocationRelativeTo(null);
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

    GroupLayout layout = new GroupLayout(registrationPanel);
    registrationPanel.setLayout(layout);

    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);

    // layout start
    layout.setHorizontalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(LEADING)
                    .addComponent(jLabelName)
                    .addComponent(jLabelLastName)
                    .addComponent(jLabelSSN)
                    .addComponent(jLabelDateOfBirth)
                    .addComponent(jLabelGrossSales))
            .addGroup(layout.createParallelGroup(LEADING)
                    .addComponent(jTextFieldName)
                    .addComponent(jTextFieldLastName)
                    .addComponent(jTextFieldSocialSecurityNumber)
                    .addComponent(jTextFieldDateOfBirth)
                    .addComponent(jTextFieldGrossSales)
                    .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(LEADING)
                                    .addComponent(jRadioButtonBasedSalaried)
                                    .addComponent(jRadioButtonCommission))
                            .addGroup(layout.createParallelGroup(LEADING)
                                    .addComponent(jRadioButtonHourly)
                                    .addComponent(jRadioButtonSalary)))

                    .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(LEADING)
                                    .addComponent(jButtonOk))
                            .addGroup(layout.createParallelGroup(LEADING)
                                    .addComponent(jButtonCancel)))
            )
    );
    layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(BASELINE)
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
                    .addComponent(jTextFieldGrossSales))

            .addGroup(layout.createParallelGroup(LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(BASELINE)
                                    .addComponent(jRadioButtonBasedSalaried)
                                    .addComponent(jRadioButtonHourly))
                            .addGroup(layout.createParallelGroup(BASELINE)
                                    .addComponent(jRadioButtonCommission)
                                    .addComponent(jRadioButtonSalary))))

            .addGroup(layout.createParallelGroup(LEADING)
                    .addGroup(layout.createParallelGroup()
                            .addGroup(layout.createParallelGroup(BASELINE))
                            .addComponent(jButtonOk))
                    .addGroup(layout.createParallelGroup()
                            .addComponent(jButtonCancel)))

    );
    //layout END

    //Added JButtonGroup RadioButton
    ButtonGroup buttonGroupRadio = new ButtonGroup();
    buttonGroupRadio.add(jRadioButtonBasedSalaried);
    buttonGroupRadio.add(jRadioButtonCommission);
    buttonGroupRadio.add(jRadioButtonHourly);
    buttonGroupRadio.add(jRadioButtonSalary);
    //END

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
