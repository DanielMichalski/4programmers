package pl.programmers.mvc.view;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Daniel
 */
public class MainPanel extends JPanel {
    private JButton button;

    private JLabel label;

    public MainPanel() {
        initliazeComponents();
    }

    private void initliazeComponents() {
        setLayout(null);

        button = new JButton("Kliknij");
        label = new JLabel();

        JTextPane textPane = new JTextPane();
        textPane.setBounds(0, 0, 50, 200);
        textPane.setSize(new Dimension(40, 150));
        textPane.setBackground(Color.blue);
        textPane.setText("dfsgggggggggggggggggggadfsddsf");

        add(button);
        add(label);
        add(textPane);
    }

    public JButton getButton() {
        return button;
    }

    public JLabel getLabel() {
        return label;
    }
}
