import java.util.Scanner;

/**
 * Created by dab137 on 3/21/2016.
 */
public class CharacterTest2 {
    public static void main(String[] args) {

       /* String str = "Four score and seven years ago";
        if(str.startsWith("Four"))
            System.out.println("It starts with FOUR");
        else
            System.out.println("It doesn't start with FOUR");
            */

        /*
        String lookup;

        String[] people = {"Cutsaw, Will", "Davis, George", "Davis, Jenny"};

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first character of the last name to look up");

        lookup = keyboard.nextLine();

        System.out.println("Here are the names that match");

        for(String individual : people){
            if (individual.startsWith(lookup))
                System.out.println(individual);
        }
        */

        String str = "and a one and a two and a three";
        int position;

        System.out.println("The word and appears at positions: ");
        position = str.indexOf("and");

        while (position!=-1){
            System.out.println(position);
            position = str.indexOf("and", position + 1);
        }

    }
}
