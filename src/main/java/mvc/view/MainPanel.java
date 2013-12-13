package mvc.view;

import javax.swing.*;

/**
 * Author: Daniel
 */
public class MainPanel extends JPanel {
    private JButton button;

    public MainPanel() {
        initliazeComponents();
    }

    private void initliazeComponents() {
        button = new JButton("Kliknij");
        add(button);
    }

    public JButton getButton() {
        return button;
    }
}
