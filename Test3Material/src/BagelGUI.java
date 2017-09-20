import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 * Created by dab137 on 4/20/2016.
 */
public class BagelGUI {
    private JPanel panel1;
    private JRadioButton radWhiteBagel;
    private JRadioButton radWheatBagel;
    private JCheckBox chkCreamCheese;
    private JCheckBox chkButter;
    private JCheckBox chkPeachJelly;
    private JCheckBox chkBlueberryJam;
    private JRadioButton radNone;
    private JRadioButton radRegularCoffee;
    private JRadioButton radDecafCoffee;
    private JRadioButton radCappuccino;
    private JButton btnExit;
    private JButton btnCalculate;

    private final double WHITE_BAGEL = 1.25;
    private final double WHEAT_BAGEL = 1.50;
    private final double CREAM_CHEESE = 0.50;
    private final double BUTTER = 0.25;
    private final double PEACH_JELLY = 0.75;
    private final double BLUEBERRY_JAM = 0.75;
    private final double NO_COFFEE = 0.0;
    private final double REGULAR_COFFEE = 1.25;
    private final double DECAF_COFFEE = 1.25;
    private final double CAPPUCCINO = 2.00;
    private final double TAX_RATE = 0.08;


    public static void main(String[] args) {
        JFrame frame = new JFrame("BagelGUI");
        frame.setContentPane(new BagelGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public BagelGUI(){
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Variables to holdthe subtotal, tax, and total
                double subtotal, tax, total;

                //Calculate
                subtotal = getBagelCost() + getToppingCost() + getCoffeeCost();
                tax = subtotal * TAX_RATE;
                total = subtotal + tax;
                //Create a DecimalFormat object to format the output.
                DecimalFormat dollar = new DecimalFormat("$0.00");

                //Display
                JOptionPane.showMessageDialog(null, "Subtotal: " + dollar.format(subtotal) + "\n" +
                                                    "Tax: " + dollar.format(tax) + "\n" +
                                                    "Total: " + dollar.format(total));
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public double getBagelCost(){
        double bagelCost = 0.0;

        if (radWhiteBagel.isSelected())
            bagelCost = WHITE_BAGEL;
        else bagelCost = WHEAT_BAGEL;

        return bagelCost;
    }

    public double getToppingCost(){
        double toppingCost = 0.0;

        if (chkCreamCheese.isSelected())
            toppingCost += CREAM_CHEESE;
        if (chkButter.isSelected())
            toppingCost += BUTTER;
        if (chkPeachJelly.isSelected())
            toppingCost += PEACH_JELLY;
        if (chkBlueberryJam.isSelected())
            toppingCost += BLUEBERRY_JAM;

        return toppingCost;
    }

    public double getCoffeeCost(){
        double coffeeCost = 0.0;

        if (radNone.isSelected())
            coffeeCost = NO_COFFEE;
        if (radRegularCoffee.isSelected())
            coffeeCost = REGULAR_COFFEE;
        if (radDecafCoffee.isSelected())
            coffeeCost = DECAF_COFFEE;
        if (radCappuccino.isSelected())
            coffeeCost = CAPPUCCINO;

        return coffeeCost;
    }



}
