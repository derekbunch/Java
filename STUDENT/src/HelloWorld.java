import java.util.Scanner;

/**
 * Created by ijr5 on 1/25/2016.
 */
public class HelloWorld {
    public static void main(String[] args){
        String firstName2;
        firstName2 = "Mary";
        System.out.println(firstName2.toUpperCase());
        final double INTEREST_RATE = 0.49;
        System.out.println("Hello World!");
        int var;
        double price;
        boolean decision;
        String firstName; // this is a string
        var=5;
        firstName="John";
        System.out.print(firstName + " " + var + " ");
        System.out.println(firstName.length());
        System.out.println("Welcome\tto\tmy\tjava\tclass\ncis3389");
        double number;
        number = 5.0/2;
        System.out.println(number);
        double result = Math.sqrt(9.0);
        System.out.println(result);
        double var2 = 72.567;
        int number2 = (int)72.567;
        System.out.println(number2);

        String name;
        int hours;
        double payRate, grossPay;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("How many hours did you work?");
        hours = keyboard.nextInt();

        System.out.println(name + " " + hours);

    }

}
