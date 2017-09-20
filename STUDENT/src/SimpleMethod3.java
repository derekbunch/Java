/**
 * Created by ijr5 on 2/8/2016.
 */
public class SimpleMethod3 {
    public static void main(String[] args) {

        showSum(2.5,2.5);
    }

    /**
     * The showSum method is doing.....
     * @param v The first number
     * @param v1 The second number
     */
    private static void showSum(double v, double v1) {
        double sum;
        sum=v+v1;
        System.out.println("The sum is : " + sum);
    }
}
