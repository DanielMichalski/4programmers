package pl.programmers.jcombobox_zdarzenia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<String>();

        String imie1 = "Kasia";
        String imie2 = "Asia";
        String imie3 = "Basia";

        comboBox.addItem(imie1);
        comboBox.addItem(imie2);
        comboBox.addItem(imie3);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("zdarzenie1");
            }
        });

        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("zdarzenie2");
            }
        });

        comboBox.setSelectedItem(imie2);
    }
}
