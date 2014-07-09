package pl.programmers.mvc.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author: Daniel
 */
public class MainFramePresenter {
    private JLabel label;

    class ButtonLister implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Thread thread = new Thread(new Runnable() {
                int i = 0;
                @Override
                public void run() {
                    while (true) {
                        label.setText("" + i);
                        i++;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            });
            thread.start();
        }
    }

    public void setButton(JButton button) {
        button.addActionListener(new ButtonLister());
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
}
