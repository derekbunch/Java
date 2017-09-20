/**
 * Created by Owner on 4/1/2016.
 */
public class RoomDimension {
    private double length, width;

    public RoomDimension (double len, double w){
        length = len;
        width = w;
    }

    public double getArea (){
        return length * width;
    }

    public String toString (){
        return ("The area of the room is " + getArea() + ".");
    }

}
