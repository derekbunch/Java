import java.util.Scanner;

/**
 * Created by dab137 on 3/28/2016.
 */
public class CurvedDemo {
    public static void main(String[] args) {

        double score, curvedPercent;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the student raw numeric score");
        score = keyboard.nextDouble();

        System.out.println("Enter the curved percentage");
        curvedPercent = keyboard.nextDouble();

        CurvedActivity exam = new CurvedActivity(curvedPercent);
        exam.setScore(score);

        System.out.println("The raw score is " + exam.getScore());
        System.out.println("The curved grade is " + exam.getGrade());

    }
}
