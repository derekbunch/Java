import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by dab137 on 4/6/2016.
 */
public class OpenFile {
    public static void main(String[] args) {
        File file;
        Scanner inputFile;
        String fileName;

        fileName = JOptionPane.showInputDialog("Enter a file name: ");


        try {
            file = new File(fileName);
            inputFile = new Scanner(file);
            JOptionPane.showMessageDialog(null, "The file was found");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "The file was NOT found" + e.getMessage());
        }

        JOptionPane.showMessageDialog(null, "Done");
        System.exit(0);




    }
}
