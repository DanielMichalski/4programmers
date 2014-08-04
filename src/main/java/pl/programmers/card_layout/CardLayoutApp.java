package pl.programmers.card_layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CardLayoutApp {

    public static void main(String[] args) {

        JFrame frame = new JFrame("CardLayout");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JComboBox box = new JComboBox(new String[] { "1", "2" });

        CardLayout cardLayout = new CardLayout();
        JPanel cards = new JPanel(cardLayout);
        cards.add(new MyPanel(cardLayout), "1");
        cards.add(new MyPanel(cardLayout), "2");

        box.addItemListener(new Pager(cardLayout, cards));

        frame.getContentPane().setLayout(new BorderLayout());

        frame.getContentPane().add(box, BorderLayout.NORTH);
        frame.getContentPane().add(cards, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    static class Pager implements ItemListener {

        private CardLayout cardLayout;

        private JPanel cards;

        public Pager(CardLayout cardLayout, JPanel cards) {
            this.cardLayout = cardLayout;
            this.cards = cards;
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            cardLayout.show(cards, (String) e.getItem());
        }
    }
}

/**
 * Klasa reprezentuje abstrakcyjny komponent stworzony przez użytkownika.
 *
 * @author koziolek
 *
 */
class MyPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    public MyPanel(CardLayout cardLayout) {
        super(new BorderLayout());
        init();
    }

    private void init() {
        JTextArea area = new JTextArea();
        add(area, BorderLayout.CENTER);
        setPreferredSize(new Dimension(300, 300));
    }
}