import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Owner on 4/1/2016.
 */
public class RoomCarpetTest {
    public static void main(String[] args)throws IOException {

        String filename;
        double len, w, cost;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the lenth of the room.");
        len = keyboard.nextDouble();

        System.out.println("Enter the width of the room.");
        w = keyboard.nextDouble();

        System.out.println("Enter the cost of the carpet per square feet.");
        cost = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Enter a filename: ");
        filename = keyboard.nextLine();

        RoomDimension myDimen = new RoomDimension(len, w);
        RoomCarpet myCarpet = new RoomCarpet(myDimen, cost);

        System.out.println(myDimen.toString());
        System.out.println(myCarpet.toString());

        PrintWriter writeFile = new PrintWriter(filename + ".txt");

            writeFile.println(myDimen.toString() + "\n" + myCarpet.toString());

        writeFile.close();
        System.out.println("The data was saved to the file");
    }
}
