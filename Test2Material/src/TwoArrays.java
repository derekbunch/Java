import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dab137 on 3/2/2016.
 */
public class TwoArrays {

    // an array of type array, array-ception {{1, 5, 4}, {1, 1, 1}, {2, 3, 4}}

    public static void main(String[] args) {
        final int ROWS = 3;
        final int COLS = 4;

        int[][] numbers = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};

        //displayArray(numbers);

        int[][] ragged = new int [4][];
        ragged[0] = new int[2];
        ragged[1] = new int[5];
        ragged[3] = new int[3];
        ragged[3] = new int[7];

        double[][][] seats = new double[3][5][7];

        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();

        accountList.add(new BankAccount());
        accountList.add(new BankAccount(2000));


        nameList.add("Mike");
        nameList.add("Judy");
        nameList.add("Smith");

        System.out.println(nameList.size());

        System.out.println(nameList.get(1));

        nameList.set(0,"Mary");
        for(String item:nameList){
            System.out.println(item);
            System.out.println(nameList.toString());
        }


/*
        Scanner keyboard = new Scanner(System.in);
        double [] [] values = new double[3][4];

        for (int row=0; row<values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                System.out.println("Enter a value to be stored ");
                values[row][col] = keyboard.nextDouble();

            }
        }
        double total=0;
            for (int row=0; row<values.length; row++) {
                for (int col = 0; col < values[row].length; col++) {
                    System.out.println("Value of cell " + row + " " + col + " is " + values[row][col]);
                    total+=values[row][col];
                    System.out.println(total);

                }
            }
       */
    }


    private static void displayArray(int[][] anyNumberArray) {
        for (int row=0; row<anyNumberArray.length; row++){
            for (int col=0; col<anyNumberArray[row].length; col++){
                System.out.println(anyNumberArray[row][col]);
            }
        }
    }


}
