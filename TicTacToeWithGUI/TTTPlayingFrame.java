import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TTTPlayingFrame extends JFrame implements ActionListener {

    JPanel spielfeld = new JPanel();
    JButton[] buttonfeld = new JButton[9];
    boolean spieler1Zug = true;
    String spieler1xOdero = " ";
    String spieler2xOdero = " ";
    JTextField auswahl = new JTextField();

    TTTPlayingFrame(String oOderx) {
        spieler1xOdero = oOderx;
        if (spieler1xOdero.compareTo("X") == 1) {
            spieler2xOdero = "O";
        } else {
            spieler2xOdero = "X";
        }

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
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttonfeld[i]) {
                if (buttonfeld[i].getText() == "") {
                    if (spieler1Zug) {
                        buttonfeld[i].setForeground(Color.BLACK);
                        buttonfeld[i].setText(spieler1xOdero);
                        buttonfeld[i].setFont(new Font("Comic Sans", Font.BOLD, 100));
                        spieler1Zug = false;
                        check(spieler1xOdero);
                    } else {
                        buttonfeld[i].setForeground(Color.BLACK);
                        buttonfeld[i].setText(spieler2xOdero);
                        buttonfeld[i].setFont(new Font("Comic Sans", Font.BOLD, 100));
                        spieler1Zug = true;
                        check(spieler2xOdero);

                    }
                }
            }
        }
    }

    private void check(String xOdero) {
        if (buttonfeld[0].getText().compareTo(xOdero) == 1 && buttonfeld[1].getText().compareTo(xOdero) == 1
                && buttonfeld[3].getText().compareTo(xOdero) == 1) {
            checkWinner(0, 1, 2, xOdero);
        } else if (buttonfeld[3].getText().compareTo(xOdero) == 1 && buttonfeld[4].getText().compareTo(xOdero) == 1
                && buttonfeld[5].getText().compareTo(xOdero) == 1) {
            checkWinner(3, 4, 5, xOdero);
        } else if (buttonfeld[6].getText().compareTo(xOdero) == 1 && buttonfeld[7].getText().compareTo(xOdero) == 1
                && buttonfeld[8].getText().compareTo(xOdero) == 1) {
            checkWinner(6, 7, 8, xOdero);
        } else if (buttonfeld[0].getText().compareTo(xOdero) == 1 && buttonfeld[3].getText().compareTo(xOdero) == 1
                && buttonfeld[6].getText().compareTo(xOdero) == 1) {
            checkWinner(0, 3, 6, xOdero);
        } else if (buttonfeld[1].getText().compareTo(xOdero) == 1 && buttonfeld[4].getText().compareTo(xOdero) == 1
                && buttonfeld[7].getText().compareTo(xOdero) == 1) {
            checkWinner(1, 4, 7, xOdero);
        } else if (buttonfeld[2].getText().compareTo(xOdero) == 1 && buttonfeld[5].getText().compareTo(xOdero) == 1
                && buttonfeld[8].getText().compareTo(xOdero) == 1) {
            checkWinner(3, 4, 5, xOdero);
        } else if (buttonfeld[0].getText().compareTo(xOdero) == 1 && buttonfeld[4].getText().compareTo(xOdero) == 1
                && buttonfeld[8].getText().compareTo(xOdero) == 1) {
            checkWinner(0, 4, 8, xOdero);
        } else if (buttonfeld[2].getText().compareTo(xOdero) == 1 && buttonfeld[4].getText().compareTo(xOdero) == 1
                && buttonfeld[6].getText().compareTo(xOdero) == 1) {
            checkWinner(2, 4, 6, xOdero);
        }

    }

    private void checkWinner(int a, int b, int c, String winner) {

    }

}