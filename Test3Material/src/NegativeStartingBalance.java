/**
 * Created by dab137 on 4/13/2016.
 */
public class NegativeStartingBalance extends Exception {

    public NegativeStartingBalance() {
        super("Error: Negative Balance");
    }

    public NegativeStartingBalance(double amount){
        super("Error: Negative Balance " + amount);
    }
}
