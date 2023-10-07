import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;

public class TTTAuswahl extends JFrame implements ActionListener {
    JTextField auswahl = new JTextField();
    JButton submitButton = new JButton();
    JPanel firstRow = new JPanel();
    JLabel womitSpielen = new JLabel();

    TTTAuswahl() {

        submitButton.setBounds(190, 40, 100, 32);
        submitButton.setText("Benutzen");
        submitButton.setFocusable(false);
        submitButton.setFont(new Font("Comic Sans", Font.BOLD, 13));
        submitButton.setBackground(Color.lightGray);
        submitButton.addActionListener(this);

        auswahl.setBounds(10, 40, 180, 30);

        womitSpielen.setText("Womit möchten sie spielen?");
        womitSpielen.setFont(new Font("Comic Sans", Font.BOLD, 13));
        womitSpielen.setBackground(new Color(95, 158, 160));
        womitSpielen.setOpaque(true);
        womitSpielen.setBounds(15, 10, 300, 30);

        firstRow.setLayout(null);
        firstRow.setBounds(0, 0, 350, 80);
        firstRow.setBackground(new Color(95, 158, 160));
        firstRow.add(submitButton);
        firstRow.add(auswahl);
        firstRow.add(womitSpielen);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(400, 170);
        this.getContentPane().setBackground(new Color(95, 158, 160));
        this.add(firstRow);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        new TTTPlayingFrame(auswahl.getText());
    }
}
