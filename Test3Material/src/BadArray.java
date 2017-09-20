/**
 * Created by dab137 on 4/6/2016.
 */
public class BadArray {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};

        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(numbers[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
