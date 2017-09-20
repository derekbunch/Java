/**
 * Created by dab137 on 3/28/2016.
 */
public abstract class Student {
    private String name, idNumber;
    private int yearAdmitted;

    public Student(String name, String idNumber, int yearAdmitted) {
        this.name = name;
        this.idNumber = idNumber;
        this.yearAdmitted = yearAdmitted;
    }

    public String toString() {
        String str = "Name " + name + "\nID Number " + idNumber + "\nYear Admitted " + yearAdmitted;
        return str;
    }

    public abstract int getRemainingHours();


}
