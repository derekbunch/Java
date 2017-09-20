import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by dab137 on 3/2/2016.
 */
public class BankAccountTest {
        public static void main(String[] args) {

            BankAccount myAccount1 = new BankAccount(); //Does not require a parameter because the original instantiation did not ask for a parameter

            BankAccount myAccount2 = new BankAccount(22.56); //Double can be accepted as a parameter because of the first constructor

            BankAccount myAccount3 = new BankAccount("22.00"); //string can be converted automatically because of the second constructor

            BankAccount[] accounts = new BankAccount[3];

            createAccount(accounts);


        }

    private static void createAccount(BankAccount[] accounts) {

        Scanner keyboard = new Scanner(System.in);

        for(int index=0; index<accounts.length; index++) {
            System.out.println("Enter the balance for the account " + (index+1) + ": ");
            Double value = keyboard.nextDouble();
            accounts[index] = new BankAccount(value);
            System.out.println(accounts[index].getBalance());


        }

        accounts[0].setBalance(100000);


    }
}


