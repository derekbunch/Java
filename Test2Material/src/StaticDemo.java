/**
 * Created by dab137 on 3/7/2016.
 */
public class StaticDemo {
    public static void main(String[] args) {

        int objectCount;

        Countable object1 = new Countable();
        Countable object2 = new Countable();
        Countable object3 = new Countable();

        objectCount = object2.getInstanceCountable();

        System.out.println(objectCount + " instances of the class have been created");


    }
}
