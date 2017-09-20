import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by dab137 on 4/13/2016.
 */
public class ReadBinaryFile {
    public static void main(String[] args) throws IOException {
        int number;
        boolean endOfFile = false;

        FileInputStream fstream = new FileInputStream("Numbers.dat");
        DataInputStream inputFile = new DataInputStream(fstream);
        System.out.println("reading the numbers.....");

        while (!endOfFile){
            number = inputFile.readInt();
            System.out.println(number + " ");
        }
        inputFile.close();
    }

}
