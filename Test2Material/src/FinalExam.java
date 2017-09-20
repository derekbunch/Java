import java.security.PublicKey;

/**
 * Created by dab137 on 3/23/2016.
 */
public class FinalExam extends GradedActivity {
    private int numQuestions, numMissed;
    private double pointsEach;

    public FinalExam(int numQuestions, int numMissed){
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;

        pointsEach = 100.0/ numQuestions;
        double numericScore = 100.0-(numMissed*pointsEach);
        setScore(numericScore);
    }
    public double getPointsEach(){
        return pointsEach;
    }

    public int getNumMissed(){
        return numMissed;
    }


}
