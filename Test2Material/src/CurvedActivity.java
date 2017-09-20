
/**
 * Created by dab137 on 3/28/2016.
 */
public class CurvedActivity extends GradedActivity {
    double rawScore, percentage;

    public CurvedActivity(double percent){
        percentage = percent;
        rawScore = 0.0;

    }

    public void setScore(double s){
        rawScore = s;
        super.setScore(rawScore*percentage);
    }

    public double getRawScore(){
        return rawScore;
    }

    public double getPercentage(){
        return percentage;
    }

}
