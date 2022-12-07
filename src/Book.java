public class Book {
private String title;
private int year;
public String authorName;

public Book (String title, int year, String authorName) {
    this.title = title;
    this.year = year;
    this.authorName = authorName;
}

    public String getTitle() {
        return this.title;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}