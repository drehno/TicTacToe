import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class TTTSettings extends JFrame implements ActionListener {

    JButton zurückButton = new JButton();
    JPanel upperRowJPanel = new JPanel();

    TTTSettings() {
        zurückButton.setBounds(0, 0, 100, 50);
        zurückButton.addActionListener(this);
        zurückButton.setFocusable(false);
        zurückButton.setText("zurück");

        upperRowJPanel.setLayout(null);
        upperRowJPanel.setBounds(0, 0, 350, 80);
        upperRowJPanel.setBackground(new Color(95, 158, 160));
        upperRowJPanel.add(zurückButton);

        this.setTitle("Einstellungen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(95, 158, 160));
        this.add(upperRowJPanel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == zurückButton) {
            this.dispose();
            new TicTacToeFrame();
        }
    }

}
