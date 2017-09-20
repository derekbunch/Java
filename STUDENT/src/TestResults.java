import javax.swing.*;

/**
 * Created by ijr5 on 1/27/2016.
 */
public class TestResults {
    public static void main(String[] args) {

        int testScore;
        String input;
        input = JOptionPane.showInputDialog("Enter your test score:");
        testScore = Integer.parseInt(input);

        if (testScore < 60)
            JOptionPane.showMessageDialog(null, "Your grade is an F");
        else if (testScore < 70)
            JOptionPane.showMessageDialog(null, "Your grade is an D");
        else if (testScore < 80)
            JOptionPane.showMessageDialog(null, "Your grade is an C");
        else if (testScore < 90)
            JOptionPane.showMessageDialog(null, "Your grade is an B");
        else if (testScore < 100)
            JOptionPane.showMessageDialog(null, "Your grade is an A");
        else
            JOptionPane.showMessageDialog(null, "Your grade cannot be higher than 100");

        System.exit(0);
    }
}
