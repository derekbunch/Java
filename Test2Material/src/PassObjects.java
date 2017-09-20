import java.awt.*;

/**
 * Created by dab137 on 3/7/2016.
 */
public class PassObjects {
    public static void main(String[] args) {

        Rectangle box = new Rectangle(12.0, 5.0);
        Rectangle box1 = new Rectangle(5.0, 7.0);

        displayRectangle(box);
        
        changeRectangle(box);

        displayRectangle(box);

        doSomething(box, box1);
        
    }

    private static double doSomething(Rectangle box, Rectangle box1) {
        return box.getArea() + box1.getArea();

    }

    private static void changeRectangle(Rectangle y) {
        y.setLength(0.0);
        y.setWidth(0.0);
    }

    private static void displayRectangle(Rectangle x) {
        System.out.println(" Length: " + x.getLength() + " Width: " + x.getWidth());
    }
}
