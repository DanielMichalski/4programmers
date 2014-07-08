package copy_files.no_mine;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Kopia {
    JFrame okno; //modyfikatory dostępu (public, private, ...) są w tym przypadku zbędne ponieważ
    JTextField tf, tf2; //cała aplikacja zawiera się w jednej klasie
    JLabel label1, label2;  // najlepiej zadeklarować komponenty w ciele klasy - nie metody
    // tym bardziej przy bardziej rozbudowanych programach gdzie wymagany jest
    // dostęp do elementów okna z poziomu różnych metod

    public Kopia(String tytul) { // do budowy okna można użyć konstruktora klasy, choć nie jest to konieczność
        // można nawet budowę okna mieć w jednej metodzie, a jego wypełnienie
        // różnymi komponentami w innej.
        okno = new JFrame();
        okno.setSize(300, 150);
        okno.setTitle(tytul);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setResizable(true);
        okno.setLocationRelativeTo(null);
        okno.setLayout(null);

        label1 = new JLabel();
        label1.setText("Etykieta 1");
        label1.setBounds(20, 10, 260, 20);

        tf = new JTextField();
        // Poniższe pola można zastąpić jedną metodą setBounds
        // tf.setSize(300,00);
        // tf.setLocation(50,50); // pozycja pola tekstowego i jego rozmiar\
        tf.setBounds(20, 30, 260, 20);
        tf.setText(null); // pole jest puste
        tf.setToolTipText("Pole tekstowe 1");

        label2 = new JLabel();
        label2.setText("Etykieta 2");
        label2.setBounds(20, 60, 260, 20);

        tf2 = new JTextField();
        tf2.setBounds(20, 80, 260, 20);
        tf2.setText(null); // pole jest puste
        tf2.setToolTipText("Pole tekstowe 2");

        tf.addKeyListener(new KeyEnterListener());
        tf2.addKeyListener(new KeyEnterListener());

        okno.add(label1);
        okno.add(tf);
        okno.add(label2);
        okno.add(tf2);

        okno.setIgnoreRepaint(false);   //dzięki tej metodzie (z wartością "false")
        //zawartość okna po zminimalizowaniu jest odświeżana
        okno.setVisible(true);  // najlepiej tą metodę umieścić na końcu konstruktora
        //ładuje wtedy całą zawartość okna i nie trzeba używać poniższej metody
        //do odświeżenia zawartości okna.
        // okno.repaint();
    }

    class KeyEnterListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                Path sourcePath = Paths.get(tf.getText());
                Path targetPath = Paths.get(tf2.getText());

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

    public static void main(String args[]) {
        new Kopia("Tytuł okna - dowolny...");
    }
}