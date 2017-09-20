/**
 * Created by dab137 on 3/28/2016.
 */
public class PassFailExam extends PassFailActivity {
    private int numOfQuestions, numMissed;
    private double pointsEach;

    public PassFailExam(int questions, int missed, double minPassing){
        super(minPassing);
        double numericScore;
        numOfQuestions = questions;
        numMissed = missed;

        pointsEach = 100.0/questions;
        numericScore = 100.0-(missed * pointsEach);
        setScore(numericScore);

    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
