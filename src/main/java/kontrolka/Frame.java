package kontrolka;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Author: Daniel
 */
public class Frame extends JFrame {
    public Frame() {
        setSize(500, 500);

        add(new JLabel("test"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double();
        g2d.setColor(getBackground());
        circle.width = 50;
        circle.height = 50;
        circle.x = 140;
        circle.y = 140;
        g2d.draw(circle);
        g2d.setColor(Color.green);
        g2d.fill(circle);
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(Color.black);
        g2d.draw(circle);
        g2d.setPaintMode();
    }
}

class Runner {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
