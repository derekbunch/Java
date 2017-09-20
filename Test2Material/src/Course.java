/**
 * Created by dab137 on 3/9/2016.
 */
public class Course {
    String courseName;
    Instructor instructor;
    TextBook textBook;

    public Course(String courseName, Instructor instructor, TextBook textBook) {
        this.courseName = courseName;
        this.instructor = new Instructor(instructor);
        this.textBook = new TextBook(textBook);
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return new Instructor(instructor);
    }

    public TextBook getTextBook() {
        //Using the "new" constructor means that it returns a COPY of the object rather than the original so that it
        // can not be modified
        return new TextBook(textBook);
    }

    public String toString(){
        String str = "Course Name: " + courseName +
                "\nInstructor Information: " + instructor +
                "\nTextbook Information: " + textBook;
        return str;
    }


}
