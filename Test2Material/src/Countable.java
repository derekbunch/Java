/**
 * Created by dab137 on 3/7/2016.
 */
public class Countable {

    private static int instanceCount = 0;

    public Countable(){
        instanceCount++;
    }

    public int getInstanceCountable(){
        return instanceCount;
    }

}
