package frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsEventFrame extends JFrame {

    private JTextField txt1;
    private JTextField txt2;

    public ButtonsEventFrame() {
        setupFrame();
        initializeComponents();
    }

    private void initializeComponents() {
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");

        txt1 = new JTextField(12);
        txt2 = new JTextField(12);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearTextBoxes();
                txt1.setText("Hello!");
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearTextBoxes();
                txt2.setText("Goodbye!");
            }
        });

        add(b1);
        add(txt1);
        add(b2);
        add(txt2);
    }

    private void clearTextBoxes() {
        txt1.setText("");
        txt2.setText("");
    }

    private void setupFrame() {
        setTitle("Button Event Demo");
        setSize(250, 250);
        setLayout(new FlowLayout());
    }
}

class ButtonsEventDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ButtonsEventFrame frame = new ButtonsEventFrame();
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
