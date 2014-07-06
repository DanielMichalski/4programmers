import javax.swing.*;
import java.awt.*;

/**
 * Author: Daniel
 */
public class LabelPanel extends JPanel {
    public LabelPanel() {
        preparePanel();
        initializeComponents();
    }

    private void preparePanel() {
        setLayout(null);
    }

    private void initializeComponents() {
        JLabel etykieta = new JLabel("etykieta");
        etykieta.setBounds(100, 200, 100, 50);
        etykieta.setBackground(Color.blue);
        add(etykieta);
    }
}
