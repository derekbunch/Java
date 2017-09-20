/**
 * Created by ijr5 on 2/15/2016.
 */
public class Dealer {
    private int die1Value;
    private int die2Value;

    public Dealer() {
        die1Value = 0;
        die2Value = 0;

    }

    public void rollDice(){
        final int SIDES = 6;
        Die die1 = new Die(SIDES);
        Die die2 = new Die(SIDES);

        die1Value = die1.getValue();
        die2Value = die2.getValue();

    }

    public String getChoOrHan(){
        String result;
        int sum = die1Value + die2Value;

        if (sum % 2 == 0)
            result = "Cho (even)";
        else
            result = "Han (odd)";

        return result;

    }

    public int getDie1Value() {
        return die1Value;
    }

    public int getDie2Value() {
        return die2Value;
    }
}
