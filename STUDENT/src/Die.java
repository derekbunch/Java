import java.util.Random;

/**
 * Created by ijr5 on 2/10/2016.
 */
public class Die {
    private int sides;
    private int value;

    public Die(int numSides){
        sides = numSides;
        roll();
    }

    public void roll() {
        Random rand = new Random();
        //random picks numbers at random starting at 0. 0 is not valid on die so we add 1.
        value = rand.nextInt(sides)+1;
    }

    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }
}
