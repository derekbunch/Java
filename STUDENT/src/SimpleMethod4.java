/**
 * Created by ijr5 on 2/8/2016.
 */
public class SimpleMethod4 {
    public static void main(String[] args) {

        double x;
        x = Math.pow(2.0, 3.0);
        System.out.println(x);

        int total, value1=20, value2=40;
        String totalString;
        total = sum(value1,value2);
        System.out.println("The sum of " + value1 + " and " + value2 + " is " + total);

        totalString = sum("John", "Marry");
        System.out.println(totalString);

        if (isValid(value1))
            System.out.println("The value is in range");
        else
            System.out.println("The value is not in range");

        if (isValid(200))
            System.out.println("The value is in range");
        else
            System.out.println("The value is not in range");

        String customerName;
        customerName = fullName("John", "Martin");
        System.out.println(customerName);
    }

    private static String fullName(String firstName, String lastName) {
        String name;
        name = firstName + " " + lastName;
        return name;
    }

    public static boolean isValid(int val) {
        boolean status;

        if (val >= 1 && val <= 100)
        status = true;
        else
        status = false;
        return status;
    }

    public static String sum(String var1, String var2) {
        String result;
        result = var1+var2;
        return result;
    }

    public static int sum(int num1, int num2) {
        int result;
        result = num1+num2;
        return result;
    }
}
