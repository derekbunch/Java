/**
 * Created by ijr5 on 2/8/2016.
 */
public class SimpleMethod {
    public static void main(String[] args) {

        String name = "Marry";

        String name1 = new String("John");


        int x = 10;
        System.out.println("Hello from the main method");
        /*displayValue(5);
        displayValue(x);*/

        showSum(2.5, 2.5);
        System.out.println("Hello from the main method");
    }

    private static void displayValue(int a) {
        System.out.println("The number you entered is: " + a);
    }
    public static void showSum(double num1, double num2){
        double sum;
        sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}

