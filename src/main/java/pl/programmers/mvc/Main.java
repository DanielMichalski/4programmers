package pl.programmers.mvc;

import pl.programmers.mvc.view.MainFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mainFrame = new MainFrame();
                mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                mainFrame.setVisible(true);
            }
        });
    }
}
