package mvc.view;

import mvc.controller.MainFramePresenter;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Daniel
 */
public class MainFrame extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;

    public MainFrame() {
        setUpFrame();
        initializeComponentst();
    }

    private void setUpFrame() {
        setTitle("Test");
        setSize(new Dimension(WIDTH, HEIGHT));
        setLocationRelativeTo(null);
    }

    private void initializeComponentst() {
        MainFramePresenter presenter = new MainFramePresenter();

        MainPanel mainPanel = new MainPanel();
        add(mainPanel);

        presenter.setButton(mainPanel.getButton());
    }
}
