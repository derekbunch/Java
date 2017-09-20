
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by ijr5 on 2/3/2016.
 */
public class SwitchDemo2 {
    public static void main(String[] args) throws IOException {

        String filename, friendName;
        int noOfFriends;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many friends do you have?");
        noOfFriends = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter a filename: ");
        filename = keyboard.nextLine();

        PrintWriter writeFile = new PrintWriter(filename);

        for (int i=1; i <=noOfFriends; i++){
            System.out.println("Enter the name of friend " + i);
            friendName = keyboard.nextLine();
            writeFile.println(friendName);

        }


        writeFile.close();
        System.out.println("Data was saved to the file");

        System.out.println("Do you want to append data to your file?");
        String answer = keyboard.nextLine();

        if (answer.charAt(0)=='Y'|| answer.charAt(0)=='y') {
            FileWriter fToW = new FileWriter("Student.txt", true);
            PrintWriter appendDataToFile = new PrintWriter(fToW);

            System.out.println("Enter the name of friend ");
            friendName = keyboard.nextLine();
            appendDataToFile.println(friendName);

            appendDataToFile.close();
        }
        System.out.println("Do you want to read the data from your file?");
        answer = keyboard.nextLine();
        if (answer.charAt(0)=='Y'|| answer.charAt(0)=='y') {

            System.out.println("Enter the name of the file you want to read.");
            String ftr = keyboard.nextLine();
            File fileToRead = new File(ftr);
            Scanner readFileFrom = new Scanner(fileToRead);
            while(readFileFrom.hasNext()) {
                String line = readFileFrom.nextLine();
                System.out.println(line);
            }

            readFileFrom.close();

        }
    }
}
