import javax.swing.*;

/**
 * Created by ijr5 on 1/27/2016.
 */
public class AverageScore {
    public static void main(String[] args) {
        double score1, score2, score3, average;
        String input;

        input = JOptionPane.showInputDialog("Enter score1:");
        score1 = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter score2:");
        score2 = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter score3:");
        score3 = Double.parseDouble(input);

        average = (score1+score2+score3)/3.0;

        JOptionPane.showMessageDialog(null, "The average is  " + average);
    if(average > 90) {
        JOptionPane.showMessageDialog(null, "This is a great average!");
        JOptionPane.showMessageDialog(null, "Are you sure?");
    } else {
        JOptionPane.showMessageDialog(null, "This is a good average!");
    }
        System.exit(0);


    }


}
