import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;

public class TTTAuswahl extends JFrame implements ActionListener {
    JTextField auswahl = new JTextField();
    JButton submitButton = new JButton();

    TTTAuswahl() {
        submitButton.setBounds(0, 0, 50, 30);
        submitButton.setText("Benutzen");
        submitButton.setFocusable(false);
        submitButton.setFont(new Font("Comic Sans", Font.BOLD, 13));
        submitButton.setBackground(Color.lightGray);
        submitButton.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(400, 120);

        auswahl.setPreferredSize(new Dimension(100, 30));

        this.add(auswahl);
        this.add(submitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        new TTTPlayingFrame(auswahl.getText());
    }
}
