import javax.swing.*;

/**
 * Created by dab137 on 3/7/2016.
 */
public class MetricDemo {
    public static void main(String[] args) {

        String input;
        double miles, kilos;

        input = JOptionPane.showInputDialog("Enter a distance in miles: ");
        miles = Double.parseDouble(input);

        kilos = Metric.milesToKm(miles);
        JOptionPane.showMessageDialog(null, String.format("%,.2f miles equals %,.2f kilometers", miles, kilos));

        System.exit(0);

    }
}
