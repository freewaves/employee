package com.company;

import javax.swing.*;

import static javax.swing.GroupLayout.Alignment.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
    private JFrame tableEmployeeFrame = new JFrame();
    //panel
    private JPanel salariedEmployeePanel = new JPanel();
    private JPanel registrationPanel = new JPanel();
    private JPanel hourlyEmployeePanel = new JPanel();
    private JPanel commissionEmployeePanel = new JPanel();
    private JPanel baseCommissionPanel = new JPanel();
    //combobox
    private JComboBox dayComboBox= new JComboBox();
    private JComboBox monthComboBox=new JComboBox();
    private JComboBox yearComboBox=new JComboBox ();

    //constructor
    public EmployeeFrame (){

//        initTableEmployee();
    initRegistrationFrame();

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
           salariedFrame.remove(salariedEmployeePanel);
           salariedFrame.dispose();
       }
       if (jRadioButtonCommission.isSelected()){
           commissionFrame.repaint();
           commissionFrame.remove(commissionEmployeePanel);
           commissionFrame.dispose();
       }
       if (jRadioButtonHourly.isSelected()){
           registrationFrame.repaint();
           hourlyFrame.remove(hourlyEmployeePanel);
           hourlyFrame.dispose();
       }
       if (jRadioButtonBaseCommission.isSelected()){
           baseCommissionFrame.repaint();
           baseCommissionFrame.remove(baseCommissionPanel);
           baseCommissionFrame.dispose();
       }
    }
    //registrationFrame
private void initRegistrationFrame(){


    jRadioButtonSalaried.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButtonBaseCommission.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButtonHourly.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButtonCommission.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

    GroupLayout layoutRegistration = new GroupLayout(registrationPanel);
    registrationPanel.setLayout(layoutRegistration);

    layoutRegistration.setAutoCreateGaps(true);
    layoutRegistration.setAutoCreateContainerGaps(true);

    jButtonOk.addActionListener(this::buttonOk);
    jButtonBack.addActionListener(this::buttonBack);
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
                            .addComponent(dayComboBox)
                            .addComponent(monthComboBox)
                            .addComponent(yearComboBox))
                    .addComponent(jTextFieldGrossSales))


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
                                    .addComponent(jButtonCancel)))
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
                    .addGroup(layoutRegistration.createSequentialGroup()
                            .addComponent(dayComboBox)
                            .addComponent(monthComboBox)
                            .addComponent(yearComboBox)))
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
    registrationFrame.add(registrationPanel);
    registrationFrame.setVisible(true);
    registrationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    registrationFrame.setLocationRelativeTo(null);
    registrationFrame.setResizable(false);
    registrationFrame.pack();
    //END registrationFrame
}

private void initSalariedEmployeeFrame(){


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

    public void initHourlyEmployeeFrame(){


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
        hourlyFrame.add(hourlyEmployeePanel);
        hourlyFrame.pack();
    }
    private void initCommissionEmployeeFrame(){


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
        commissionFrame.add(commissionEmployeePanel);
        commissionFrame.pack();
    }

private void initBaseCommissionFrame (){


    GroupLayout commissionLayout = new GroupLayout(baseCommissionPanel);
baseCommissionPanel.setLayout(commissionLayout);

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
    baseCommissionFrame.add(baseCommissionPanel);
    baseCommissionFrame.pack();
}
    private void initTableEmployee (){

        String[][] array = new String[][] {{ "Анатолий Васерманович" , "ГлавБух", "15000" },
                { "Сергей Андреевич"  , "Гл.Специалист", "10000" },
                { "Андрей Сергеевич", "Директор" , "50000" },{ "Келебаев Кенешович", "Гл.Санузел" , "500" }};
        String[] columnsHeader = new String[] {"ФИО", "Должность",
                "З.П"};
tableEmployeeFrame.setTitle("Table");
tableEmployeeFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JTable table1 = new JTable(array, columnsHeader);


        Vector<Vector<String>> data = new Vector<Vector<String>>();

        for (int j = 0; j < array.length; j++) {
            Vector<String> row = new Vector<String>();
            for (int i = 0; i < array[j].length; i++) {
                row.add((String)array[j][i]);
            }
            data.add(row);
        }
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table1));

        tableEmployeeFrame.setContentPane(contents);
        tableEmployeeFrame.setSize(500,400);
        tableEmployeeFrame.setVisible(true);


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
            if(salariedEmployeePanel.isVisible()==true)
            {

                Date birthday2= new Date(1,13,1997);
                ArrayList<SalariedEmployee> salariedEmployees= new ArrayList<SalariedEmployee>();
                SalariedEmployee salariedEmployee=new SalariedEmployee("Marisha","Maeva",2000,
                        "2930",500,birthday2);
                salariedEmployees.add(salariedEmployee);
            }
            else if (commissionEmployeePanel.isVisible() == true)
            {
                Date myBirthday= new Date(12,2,1989);
                ArrayList<CommissionEmployee> employees = new ArrayList <CommissionEmployee> ();
                CommissionEmployee comEmployee = new CommissionEmployee("Ann","Mist",
                        600,"278903",20,myBirthday);
                employees.add(comEmployee);

            }
            else if (baseCommissionPanel.isVisible()==true)
            {
                Date today =new Date(1,18,2019);
                ArrayList<BasePlusCommissionEmployee> basePlusCommissionEmployees = new ArrayList<BasePlusCommissionEmployee>();
                BasePlusCommissionEmployee basePlusCommissionEmployee= new BasePlusCommissionEmployee("Nathalie",
                        "Mall", 900,"8907",20,today,800,45);
                basePlusCommissionEmployees.add(basePlusCommissionEmployee);
            }
            else if(hourlyEmployeePanel.isVisible()==true)
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
