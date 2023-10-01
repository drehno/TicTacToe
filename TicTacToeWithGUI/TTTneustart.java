import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TTTneustart extends JFrame implements ActionListener {
    JButton neustart = new JButton();

    TTTneustart() {
        neustart.setBounds(200, 85, 100, 50);
        neustart.addActionListener(this);
        neustart.setText("neustart");
        neustart.setFocusable(false);
        neustart.setFont(new Font("Comic Sans", Font.BOLD, 13));
        neustart.setBackground(Color.lightGray);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(400, 170);
        this.getContentPane().setBackground(new Color(95, 158, 160));
        this.add(neustart);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        new TTTAuswahl();
    }
}
