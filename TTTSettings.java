import java.awt.Color;
import javax.swing.JFrame;

public class TTTSettings extends JFrame {

    TTTSettings() {
        this.setTitle("Einstellungen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(95, 158, 160));
    }

}
