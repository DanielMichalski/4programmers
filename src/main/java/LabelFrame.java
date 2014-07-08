import javax.swing.*;

/**
 * Author: Daniel
 */
public class LabelFrame extends JFrame {
    public LabelFrame() {
        prepareFrame();
        initializeComponents();
    }

    private void prepareFrame() {
        setSize(700, 500);
        setLocationRelativeTo(null);
    }

    private void initializeComponents() {
        LabelPanel labelPanel = new LabelPanel();
        add(labelPanel);
    }
}
