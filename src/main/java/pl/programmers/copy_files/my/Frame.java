package pl.programmers.copy_files.my;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Frame extends JFrame {
    private JTextField sourceTF;
    private JTextField targetTF;

    public Frame() {
        setUpFrame();
        initializeComponents();
    }

    private void setUpFrame() {
        setSize(600, 300);
        setLocationRelativeTo(null);
    }

    private void initializeComponents() {
        sourceTF = new JTextField(15);
        targetTF = new JTextField(15);
        JButton copyBtn = new JButton("Kopiuj");
        copyBtn.addActionListener(new CopyBtnListener());

        JPanel panel = new JPanel();
        panel.add(sourceTF);
        panel.add(targetTF);
        panel.add(copyBtn);

        add(panel);
    }

    class CopyBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Path sourcePath = Paths.get(sourceTF.getText());
            Path targetPath = Paths.get(targetTF.getText());

            try {
                Files.copy(sourcePath,
                        targetPath,
                        StandardCopyOption.REPLACE_EXISTING,
                        StandardCopyOption.COPY_ATTRIBUTES);

                JOptionPane.showMessageDialog(null, "Skopiowano");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
