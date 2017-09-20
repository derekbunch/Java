/**
 * Created by dab137 on 3/9/2016.
 */
public class TextBook {
    String title, author, publisher;

    public TextBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public TextBook (TextBook obj2){
        title = obj2.title;
        author = obj2.author;
        publisher = obj2.publisher;

    }

    public void set(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String toString(){
        String str = "Title: " + title +
                "\nAuthor: " + author +
                "\nPublisher: " + publisher;
        return str;
    }
}
