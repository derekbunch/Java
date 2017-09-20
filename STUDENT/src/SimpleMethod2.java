/**
 * Created by ijr5 on 2/8/2016.
 */
public class SimpleMethod2 {
    public static void main(String[] args) {
        String name = "Shakespeare";
        System.out.println("In the main method the name value is: " + name);

        changeName(name);

        System.out.println("Back in the main method the name now is " + name);
    }

    private static void changeName(String str) {
        str = "Dickens";
        System.out.println("In changeName the name now is : " + str);
    }
}
