import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToeFrame extends JFrame implements ActionListener {
    JButton playButton;
    JButton settingsButton;
    JLabel settingsLabel;
    JPanel menuWriting;

    TicTacToeFrame() {

        ImageIcon settings = new ImageIcon("setting.png");

        settingsLabel = new JLabel();
        settingsLabel.setIcon(settings);

        Image image2 = settings.getImage();
        Image newimg = image2.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
        settings = new ImageIcon(newimg);

        playButton = new JButton();
        playButton.setBounds(200, 300, 100, 50);
        playButton.addActionListener(this);
        playButton.setText("Spielen");
        playButton.setFocusable(false);
        playButton.setFont(new Font("Comic Sans", Font.BOLD, 13));
        playButton.setBackground(Color.lightGray);

        settingsButton = new JButton();
        settingsButton.setIcon(settings);
        settingsButton.setBounds(450, 0, 50, 50);
        settingsButton.addActionListener(this);
        settingsButton.setFocusable(false);
        // settingsButton.setForeground(Color.black);
        // settingsButton.setBackground(Color.BLACK);
        // settingsButton.setBorder(BorderFactory.createEmptyBorder());

        this.setTitle("TicTacToe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("_.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(95, 158, 160));
        this.add(playButton);
        this.add(settingsButton);
    }

    @Override
    public void actionPerformed(ActionEvent w) {
        if (w.getSource() == this.playButton) {
            this.dispose();
            new TTTPlayingFrame();
        } else if (w.getSource() == this.settingsButton) {
            this.dispose();
            new TTTSettings();
        }
    }

}