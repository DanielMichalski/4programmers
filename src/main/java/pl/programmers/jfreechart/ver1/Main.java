package pl.programmers.jfreechart.ver1;

import java.awt.*;

import static javax.swing.WindowConstants.*;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ChartFrame chartFrame = new ChartFrame();
                chartFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                chartFrame.setVisible(true);
            }
        });
    }
}
