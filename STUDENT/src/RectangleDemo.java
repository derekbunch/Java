/**
 * Created by ijr5 on 2/10/2016.
 */
public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle box = new Rectangle();
        box.setLength(10.0);
        box.setWidth(20.0);

        Rectangle patio = new Rectangle();

        String name = new String("John");
        //same  as
        //String name;
        //name = "John"

        System.out.println(box.getLength());

        System.out.println(box.getWidth());

        System.out.println(box.getArea());

    }
}
