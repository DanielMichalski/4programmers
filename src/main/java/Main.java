import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LabelFrame labelFrame = new LabelFrame();
                labelFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                labelFrame.setVisible(true);
            }
        });
    }
}
