import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TTTPlayingFrame extends JFrame implements ActionListener {

    JPanel spielfeld = new JPanel();
    JButton[] buttonfeld = new JButton[9];

    TTTPlayingFrame() {
        this.setTitle("TicTacToe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(95, 158, 160));

        spielfeld.setLayout(new GridLayout(3, 3));
        spielfeld.setBackground(new Color(95, 158, 160));

        for (int i = 0; i < 9; i++) {
            buttonfeld[i] = new JButton();
            spielfeld.add(buttonfeld[i]);
            buttonfeld[i].setFocusable(false);
            buttonfeld[i].addActionListener(this);
        }

        this.add(spielfeld);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private void werIstDran() {

    }

    private void check() {

    }

}
