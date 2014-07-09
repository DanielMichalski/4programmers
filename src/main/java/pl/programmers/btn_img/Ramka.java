package pl.programmers.btn_img;

import javax.swing.*;
import java.awt.*;

public class Ramka extends JFrame {
    public Ramka() {
        setTitle("Hospital Management");
        setSize(600, 600);
        setLayout(null);
        setLocationRelativeTo(null);

//        JLabel background = new JLabel(new ImageIcon("tlo.jpg"));
//        background.setBounds(0, 0, 600, 600);
//        add(background);

        BtnPanel btnPanel = new BtnPanel();
        btnPanel.setBounds(50, 50, 200, 200);
        add(btnPanel, BorderLayout.CENTER);

        repaint();

        setVisible(true);
    }

    public static void main(String[] args) {
        Ramka window = new Ramka();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}

class BtnPanel extends JPanel {
    public BtnPanel() {
//        ImageIcon img = new ImageIcon("btn.jpg");
//        JButton but = new JButton(img);
//        add(but);


        JLabel textField = new JLabel();
        textField.setText("<html>20<sup>o</sup></html>");
        add(textField);
    }
}
