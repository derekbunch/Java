import java.io.File;
import java.io.IOException;
import java.util.Random;


/**
 * Created by ijr5 on 2/3/2016.
 */
public class CheckFile {
    public static void main(String[] args) throws IOException {

        File fileToRead = new File("Student.txt");

        if (!fileToRead.exists()){
            System.out.println("The file doesn't exist");
            System.exit(0);
        }

        Random rnd = new Random();
        int number = rnd.nextInt(10);
        System.out.println(number);



    }
}
