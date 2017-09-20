import javax.swing.*;

/**
 * Created by dab137 on 3/23/2016.
 */
public class GradeDemo {
    public static void main(String[] args) {
        String input;
        double testScore;

        GradedActivity grade = new GradedActivity();

        input = JOptionPane.showInputDialog("Enter a numeric test score");
        testScore = Double.parseDouble(input);
        grade.setScore(testScore);

        JOptionPane.showMessageDialog(null, "The grade for that test score is: " + grade.getGrade());

        System.exit(0);

    }
}
