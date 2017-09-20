/**
 * Created by ijr5 on 2/10/2016.
 */
public class DiceDemo {
    public static void main(String[] args) {

        final int DIE1_SIDES = 6;
        final int DIE2_SIDES = 12;
        final int MAX_ROLLS = 5;

        Die die1 = new Die(DIE1_SIDES);
        Die die2 = new Die(DIE2_SIDES);

        System.out.println(die1.getValue() + "  " + die2.getValue());
        for (int i = 0; i < MAX_ROLLS; i ++){
            die1.roll();
            die2.roll();

            System.out.println( i + " " + die1.getValue() + " " + die2.getValue());
        }





    }
}
