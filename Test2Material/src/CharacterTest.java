import javax.swing.*;

/**
 * Created by dab137 on 3/21/2016.
 */
public class CharacterTest {
    public static void main(String[] args) {

        String input;
        char ch;

        input = JOptionPane.showInputDialog("Enter any single character");
        ch = input.charAt(0);

        JOptionPane.showMessageDialog(null, Character.toUpperCase('a'));

        if(Character.isLetter(ch)) {
            JOptionPane.showMessageDialog(null, "This is a letter");
        }

        if(Character.isDigit(ch)) {
            JOptionPane.showMessageDialog(null, "This is a digit");
        }

        if(Character.isLowerCase(ch)) {
            JOptionPane.showMessageDialog(null, "This is a lowercase letter");
        }

        if(Character.isUpperCase(ch)) {
            JOptionPane.showMessageDialog(null, "This is an uppercase letter");
        }

        System.exit(0);
    }
}
