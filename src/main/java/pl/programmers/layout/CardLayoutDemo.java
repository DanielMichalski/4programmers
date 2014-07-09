package pl.programmers.layout;

import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CardLayoutFrame frame = new CardLayoutFrame();
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
