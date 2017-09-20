import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dab137 on 4/20/2016.
 */
public class GUITest {
    private JPanel panel1;
    private JButton btnClick;
    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JTextField textField1;
    private JTextField textField2;


    public GUITest() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField1.getText().trim());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUITest");
        frame.setContentPane(new GUITest().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
