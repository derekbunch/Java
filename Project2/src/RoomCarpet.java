/**
 * Created by Owner on 4/1/2016.
 */
public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet (RoomDimension dim, double cost){
        size = dim;
        carpetCost = cost;

        getTotalCost();
    }

    public double getTotalCost(){
        return (carpetCost * size.getArea());
    }

    public String toString(){
        return ("The cost of the carpet for the room is " + getTotalCost() + ".");
    }
}
