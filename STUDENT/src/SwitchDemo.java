import java.util.Scanner;

/**
 * Created by ijr5 on 1/27/2016.
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int number;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter the numbers 1, 2, or 3:");
        number = keyboard.nextInt();
        switch(number)
        {
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            default:
                System.out.println("You entered other number than 1, 2, 3");


        }








    }
}
