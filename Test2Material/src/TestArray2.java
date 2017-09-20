/**
 * Created by dab137 on 2/29/2016.
 */
public class TestArray2 {
    public static void main(String[] args) {

        double[] values;
        values = getArray();
        for (double index : values){
            System.out.println(index);
        }
    }


    public static double[] getArray() {
        double[] array  = {2.5, 3.5};
        return array;
    }
}
