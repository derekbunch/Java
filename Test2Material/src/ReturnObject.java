import javax.swing.*;

/**
 * Created by dab137 on 3/7/2016.
 */
public class ReturnObject {
    public static void main(String[] args) {

        BankAccount account1;

        account1 = getAccount();

        JOptionPane.showMessageDialog(null, "The account has a balance of $" + account1.getBalance());

        System.exit(0);
    }

    private static BankAccount getAccount() {
        String input;
        double balance;

        input = JOptionPane.showInputDialog("Enter the current balance: ");
        balance = Double.parseDouble(input);
        return new BankAccount(balance);
    }
}
