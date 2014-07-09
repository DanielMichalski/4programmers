package layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Author: Daniel
 */
public class FramePanel extends JPanel {

    public final static String BUTTONPANEL = "Card with JButtons";

    public final static String TEXTPANEL = "Card with JTextField";

    CardLayoutPanel cl;

    public FramePanel() {
        initializeComponents();
    }

    private void initializeComponents() {
        cl = new CardLayoutPanel();

        JPanel comboBoxPane = new JPanel();
        String comboBoxItems[] = {BUTTONPANEL, TEXTPANEL};
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        cb.addItemListener(new ComboBoxListener());
        comboBoxPane.add(cb);

        add(cl);
        add(comboBoxPane, BorderLayout.PAGE_START);
    }

    class ComboBoxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            CardLayout layout = (CardLayout) cl.getLayout();
            layout.show(cl, (String) e.getItem());
        }
    }
}
