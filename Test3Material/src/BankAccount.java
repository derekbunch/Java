import com.sun.org.apache.xpath.internal.operations.Neg;

/**
 * Created by dab137 on 4/13/2016.
 */
public class BankAccount {
    private double balance;

    public BankAccount(){
        balance = 0.0;

    }

    public BankAccount(double startBalance) throws NegativeStartingBalance {
        if (startBalance < 0)
            throw new NegativeStartingBalance(startBalance);

        balance = startBalance;
    }

    public BankAccount(String str){
        balance = Double.parseDouble(str);
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void deposit(String str){
        balance += Double.parseDouble(str);
    }

    public void withdrawal(double amount){
        balance -= amount;
    }

    public void withdrawal(String str){
        balance -= Double.parseDouble(str);
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double b){
        balance = b;
    }

    public void setBalance(String str){
        balance = Double.parseDouble(str);
    }
}
