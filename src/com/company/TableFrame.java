package com.company;

import javax.swing.*;
import java.util.Vector;

public class TableFrame {
    private JFrame tableEmployeeFrame = new JFrame();
    public void initTableEmployee (){

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
        tableEmployeeFrame.setLocationRelativeTo(null);
        tableEmployeeFrame.setVisible(true);

    }
}
