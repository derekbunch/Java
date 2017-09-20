import org.omg.PortableInterceptor.INACTIVE;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by dab137 on 4/6/2016.
 */
public class SalesReport {
    public static void main(String[] args) {

        String fileName = "SalesReport.txt";
        int month = 0;
        double oneMonth, averageSale;
        double totalSales = 0.0;


        try {
            File file = new File(fileName);
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()){
                oneMonth = inputFile.nextDouble();
                totalSales+=oneMonth;
                month++;
            }

            inputFile.close();
            averageSale = totalSales/month;

            JOptionPane.showMessageDialog(null, String.format("Number of months: %d\n Total Sales: $%,.2f\n"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "The file " + fileName + " does not exist.");
        } catch (Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        System.exit(0);
    }
}
