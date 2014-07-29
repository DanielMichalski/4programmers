package pl.programmers.jfreechart.ver1;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Daniel
 */
public class ChartFrame extends JFrame {

    public ChartFrame() {
        prepareFrame();
        initializeComponents();
    }

    private void prepareFrame() {
        setSize(1000, 700);
        setLayout(null);
    }

    private void initializeComponents() {
        JPanel upPanel = new JPanel();
        upPanel.setBounds(0, 0, getWidth(), 100);
        upPanel.setBackground(Color.black);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBounds(0, 100, getWidth(), 600);
        bottomPanel.setBackground(Color.blue);

        add(upPanel);
        add(bottomPanel);
    }
}
