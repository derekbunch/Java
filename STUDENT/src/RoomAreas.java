import org.w3c.dom.css.Rect;

import javax.swing.*;

/**
 * Created by ijr5 on 2/10/2016.
 */
public class RoomAreas {
    public static void main(String[] args) {
        double number, totalArea;
        String input;

        Rectangle kitchen = new Rectangle();
        Rectangle bedroom = new Rectangle();

        input = JOptionPane.showInputDialog("What is the kitchen length? ");
        number = Double.parseDouble(input);
        kitchen.setLength(number);

        input = JOptionPane.showInputDialog("What is the kitchen width? ");
        number = Double.parseDouble(input);
        kitchen.setWidth(number);

        System.out.println(kitchen.getArea());

        input = JOptionPane.showInputDialog("What is the bedroom length? ");
        number = Double.parseDouble(input);
        bedroom.setLength(number);

        input = JOptionPane.showInputDialog("What is the bedroom width? ");
        number = Double.parseDouble(input);
        bedroom.setWidth(number);

        totalArea = kitchen.getArea() + bedroom.getArea();

        JOptionPane.showMessageDialog(null, "The total area of the house is: " + totalArea);

        System.exit(0);


    }
}
