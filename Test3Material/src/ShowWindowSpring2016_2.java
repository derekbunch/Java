import javax.swing.*;

/**
 * Created by dab137 on 4/13/2016.
 */
public class ShowWindowSpring2016_2 extends JFrame {

    public ShowWindowSpring2016_2(){
        setTitle("A Simple Window");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ShowWindowSpring2016_2();
    }
}
