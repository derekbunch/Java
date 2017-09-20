import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by dab137 on 4/13/2016.
 */
public class WriteBinaryFile {
    public static void main(String[] args) throws IOException {
        int[] numbers = {2, 3, 6, 8, 10, 12, 14};
        FileOutputStream fstream = new FileOutputStream("Numbers.dat");
        DataOutputStream outputFile = new DataOutputStream(fstream);
        System.out.println("Writing the numbers into the file ....");

        for (int i = 0; i < numbers.length; i++){
            outputFile.writeInt(numbers[i]);
        }

        System.out.println("Done");
        outputFile.close();
    }
}
