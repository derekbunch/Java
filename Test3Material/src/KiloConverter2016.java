import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dab137 on 4/13/2016.
 */
public class KiloConverter2016 extends JFrame {

    private JPanel panel;
    private JLabel messageLabel;
    private JTextField kiloTextField;
    private JTextField textBox2;
    private JButton calcButton;
    private JButton yellowButton;
    private JButton blueButton;
    private final int WINDOW_WIDTH = 310, WINDOW_LENGTH = 180;

    public KiloConverter2016(){
        setTitle("Kilometer Converter");
        setSize(WINDOW_WIDTH, WINDOW_LENGTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        setVisible(true);
    }

    private void buildPanel() {
        messageLabel = new JLabel("Enter the distance in kilometers");

        kiloTextField = new JTextField(10);
        textBox2 = new JTextField(10);

        calcButton = new JButton("Calculate");
        CalcButtonListener listener = new CalcButtonListener();
        calcButton.addActionListener(listener);

        JButton redButton = new JButton("Red");
        redButton.addActionListener(new RedButtonListener());
        JButton copyButton = new JButton("Copy");
        copyButton.addActionListener(new CopyButtonListener());
        yellowButton = new JButton("Yellow");
        yellowButton.addActionListener(new LastTwoButtonsListener());
        blueButton = new JButton("Blue");
        blueButton.addActionListener(new LastTwoButtonsListener());


        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);
        panel.add(redButton);
        panel.add(textBox2);
        panel.add(copyButton);
        panel.add(yellowButton);
        panel.add(blueButton);
    }

    public static void main(String[] args) {
        new KiloConverter2016();
    }

    private class CalcButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
         final double CONVERSION = 0.6214;
            String input;
            double miles;
            input = kiloTextField.getText();

            miles = Double.parseDouble(input) * CONVERSION;

            JOptionPane.showMessageDialog(null, input + " kilometers is " + miles + " miles.");

        }
    }

    private class RedButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.RED);
            messageLabel.setForeground(Color.BLUE);

        }
    }

    private class CopyButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input;
            input = kiloTextField.getText();
            textBox2.setText(input);
        }
    }

    private class LastTwoButtonsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String actionCommand = e.getActionCommand();
            /*
            if(actionCommand.equals("Yellow")){
                panel.setBackground(Color.YELLOW);
                messageLabel.setForeground(Color.BLUE);
            } else if (actionCommand.equals("Blue")){
                panel.setBackground(Color.BLUE);
                messageLabel.setForeground(Color.GREEN);
            }
            */
            if(e.getSource() == yellowButton){
                panel.setBackground(Color.YELLOW);
                messageLabel.setForeground(Color.BLUE);
            } else if(e.getSource() == blueButton){
                panel.setBackground(Color.BLUE);
                messageLabel.setForeground(Color.GREEN);
            }
        }
    }
}
