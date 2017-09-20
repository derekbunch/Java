/**
 * Created by dab137 on 3/9/2016.
 */
public class Instructor {
    String lastName, firstName;
    String officeNumber;

    public Instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public Instructor (Instructor obj2){
        firstName = obj2.firstName;
        lastName = obj2.lastName;
        officeNumber = obj2.officeNumber;
    }

    public void set(String lastName, String firstName, String officeNumber){
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNumber = officeNumber;
    }

    public String toString(){
        String str = "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nOffice Number: " + officeNumber;
        return str;
    }
}
