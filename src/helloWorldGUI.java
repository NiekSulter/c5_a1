//import com.apple.eawt.Application;
import javax.swing.*;
import java.awt.*;

public class helloWorldGUI extends JFrame {
    private JLabel label1;

    public static void main(String[] args) {
        helloWorldGUI frame = new helloWorldGUI();
        frame.setSize(300, 150);
        frame.createGUI();
        frame.setVisible(true);

        //Dock icon op MacOS veranderen naar HAN logo, alleen werkend in IntelliJ
        //ImageIcon img = new ImageIcon(helloWorldGUI.class.getResource("/logo4.gif"));
        //Application.getApplication().setDockIconImage(img.getImage());
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        label1 = new JLabel("Hello World!");

        window.setBackground(Color.BLUE);
        label1.setForeground(Color.RED);

        window.add(label1);
    }
}
