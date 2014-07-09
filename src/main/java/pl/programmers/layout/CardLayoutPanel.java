package pl.programmers.layout;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Daniel
 */
public class CardLayoutPanel extends JPanel {

    private final static String BUTTONPANEL = "Card with JButtons";

    private final static String TEXTPANEL = "Card with JTextField";

    public CardLayoutPanel() {
        setUpPanel();
        initializeComponents();
    }

    private void setUpPanel() {
        setLayout(new CardLayout());
    }

    private void initializeComponents() {
        JPanel card1 = new JPanel();
        card1.add(new JButton("Button 1"));
        card1.add(new JButton("Button 2"));
        card1.add(new JButton("Button 3"));

        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextField", 20));

        add(card1, BUTTONPANEL);
        add(card2, TEXTPANEL);
    }
}
