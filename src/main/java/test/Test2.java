package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 extends JFrame implements ActionListener
{
    JTextField tCal, tFan;
    JLabel lCal, lFan;
    JButton bKon;
    double tempCal, tempFan;
    JCheckBox chWielkie;

    public Test2()
    {
        setSize(400,200);
        setLayout(null);
        setTitle("Przeliczanie stopni");

        lCal = new JLabel("Stopnie Celsiusza");
        lCal.setBounds(20,20,150,20);
        add(lCal);

        lFan = new JLabel("Stopnie Fahrenheita");
        lFan.setBounds(20,80,150,20);
        add(lFan);

        tCal = new JTextField("32");
        tCal.setBounds(170,20,150,20);
        add(tCal);
        tCal.addActionListener(this);

        tFan = new JTextField("");
        tFan.setBounds(170,80,150,20);
        add(tFan);

        bKon = new JButton("Konwertuj");
        bKon.setBounds(100,120,150,20);
        add(bKon);
        bKon.addActionListener(this);

        chWielkie = new JCheckBox ("Wielkie litery");
        chWielkie.setBounds(250,120,150,20);
        add(chWielkie);
        chWielkie.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        Object zrodlo = e.getSource();
        if (zrodlo==bKon || zrodlo==tCal)
        {
            tempCal = Double.parseDouble(tCal.getText());
            tempFan = 32.0 + (9.0/5.0) * tempCal;
            tFan.setText(String.valueOf(tempFan));
        }
        else if (zrodlo==chWielkie)
        {
            if (chWielkie.isSelected()==true)
            {
                tFan.setFont(new Font("SandSerif", Font.BOLD, 18));
            }
            else
            {
                tFan.setFont(new Font("SandSerif", Font.PLAIN, 12));
            }
        }
    }



    public static void main(String[] args)
    {
        Test2 apka = new Test2();
        apka.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        apka.setVisible(true);
    }
}