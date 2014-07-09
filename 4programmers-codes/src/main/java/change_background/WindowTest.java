package change_background;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class WindowTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                SimpleFrame frame = new SimpleFrame();
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class SimpleFrame extends JFrame
{
    public SimpleFrame()
    {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        setSize(screenSize.width/2, screenSize.height/2);
        setTitle("Test okienek i ramek Java - Swing");

        MyComponent panel = new MyComponent();
        add(panel);

        ActionListener listener = new TimerBackgroundColor();
        Timer t = new Timer(150, listener);
        t.start();
    }

    class TimerBackgroundColor implements ActionListener
    {
        {
            rand = new Random();
        }

        public void actionPerformed(ActionEvent event)
        {
            Color c = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat());
            getContentPane().setBackground(c);
        }

        private final Random rand;
    }
}

class MyComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        g.drawString("Test", 20,20);
    }
}