/**
 * Created by dab137 on 3/7/2016.
 */
public class StockDemo {

    public static void main(String[] args) {
        Stock company1 = new Stock("XYZ", 9.62);
        //System.out.println(company1.toString());
        Stock company2 = new Stock("XYZ", 9.62);
        //System.out.println(company2);

        Stock company3;
        company3 = company1.copy();

        //Stock company4 = new Stock(company3);


    if(company1.equals(company2)){
        System.out.println("Both objects are the same");
    } else {
        System.out.println("Objects are different");
    }

}
}

