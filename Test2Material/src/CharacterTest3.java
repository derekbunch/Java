/**
 * Created by dab137 on 3/21/2016.
 */
public class CharacterTest3 {
    public static void main(String[] args) {

        StringBuilder city = new StringBuilder("San Marcos ");
        System.out.println(city);

        city.append("is my city ");
        System.out.println(city);

        city.insert(0, "You know that ");
        System.out.println(city);

        String str = city.toString();

        String[] tokens = str.split(" ");
        for (String s: tokens)
            System.out.println(s);
    }
}
