/**
 * Created by dab137 on 3/28/2016.
 */
public class Polymorphic {
    public static void main(String[] args) {

        GradedActivity exam1 = new FinalExam(50, 7);
        GradedActivity exam2 = new PassFailActivity(70);
        GradedActivity exam3 = new PassFailExam(100, 10, 70);

        System.out.println(exam3.getScore());
        System.out.println(exam3.getGrade());

        FinalExam activity = new FinalExam(50, 7);
        if(activity instanceof GradedActivity)
            System.out.println("Yes it is a graded activity");
        else
            System.out.println("It is not");



    }
}
