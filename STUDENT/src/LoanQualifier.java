import javax.swing.*;

/**
 * Created by ijr5 on 1/27/2016.
 */
public class LoanQualifier {
    public static void main(String[] args) {
        double salary, yearsOnJob;
        String input;

        input = JOptionPane.showInputDialog("Enter your annual salary:");
        salary = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter the number of years at the current job:");
        yearsOnJob = Double.parseDouble(input);

        if(salary>30000) {
            if(yearsOnJob >= 2) {
                  JOptionPane.showMessageDialog(null, "You qualify for the loan");
              } else{
                JOptionPane.showMessageDialog(null, "You must have been on your current job for at least two years");
              }
        } else {
            JOptionPane.showMessageDialog(null, "You must earn at least 30000 to qualify");
        }
    System.exit(0);
    }
}
