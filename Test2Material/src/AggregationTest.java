/**
 * Created by dab137 on 3/9/2016.
 */
public class AggregationTest {
    public static void main(String[] args) {

        Instructor myInstructor = new Instructor("Lucian", "Visinescu", "McCoy458");

        TextBook myTextBook = new TextBook("Starting out with Java", "Gaddis", "Pearson");

        Course myCourse = new Course("Intro to Java", myInstructor, myTextBook);

        System.out.println(myCourse);

    }

}
