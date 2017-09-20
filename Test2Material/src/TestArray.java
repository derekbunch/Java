import java.util.Scanner;

/**
 * Created by dab137 on 2/29/2016.
 */
public class TestArray {
    public static void main(String[] args) {

        //brackets mean array, they can be after the data type (double[] sizes, styles;) and the entire line will be an array
        //EX (int[] numbers, sizes;  where numbers AND sizes are both arrays of type int.
        //or they can be with each variable name, in which it will be specific and you can define variables and arrays in the same line
        // EX (int numbers[], sizes; where elements is an array of type int and sizes is a simple variable of type int.


        /*final int NUM_ELEMENTS= 6;
        double number;
        int[] numbers = new int[5];
        double[] sizes = new double[10];  e arrays
        String[] families;
        int[] elements = new int[NUM_ELEMENTS];*/

/*
        int[] days = {28, 29, 30, 1, 2, 3, 4};
        int elements[], count;

        System.out.println("Enter the number of elements in the array ");
        Scanner keyboard = new Scanner(System.in);
        count = keyboard.nextInt();

        elements = new int[count];

        for (int index=0; index <elements.length; index++){
            System.out.println(index+1);
        }

        for (int index:days){
            System.out.println(index);
        }
*/

        /*
        int[] array1={3, 7, 9, 1};
        int[] array2 = new int [4];

        for (int index=0; index<array2.length; index++){
            System.out.println(array2[index]);
        }

        for (int index=0; index<array1.length; index++){
            array2[index]=array1[index];
        }

        for (int index=0; index<array2.length; index++){
            System.out.println(array2[index]);
        }
*/




        int[]  numbers ={1, 3, 6, 9, 10};
        /*for (int index=0; index<numbers.length; index++){
            showValue(numbers[index]);
        }
*/
        /*
        int sum;

        int[] chicken = {2, 44, 6, 8, 10};
        //showArray(chicken);
        int highest= chicken[0];

        for (int index=1; index<chicken.length; index++){
            if(chicken[index] > highest){
                highest=chicken[index];
                System.out.println(highest);
            }
        }

*/

    }

    /*public static void showArray(int[] myR) {
        int sum=0;
        for (int index=0; index<myR.length; index++){
            sum+=myR[index];
            System.out.println(sum);
        }
    }*/

    public static void showValue(int number) {
        System.out.println(number + " ");
    }

}
