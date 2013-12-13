package mvc.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author: Daniel
 */
public class MainFramePresenter {

    class ButtonLister implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Kliknięto");
        }
    }

    public void setButton(JButton button) {
        button.addActionListener(new ButtonLister());
    }
}
