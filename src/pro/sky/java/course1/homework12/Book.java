package pro.sky.java.course1.homework12;

public class Book {
    private final String bookName;
    private final Author authorInformation;
    private int bookYear;

    public Book(Author authorInformation, String bookName, int bookYear) {
        this.bookName = bookName;
        this.authorInformation = authorInformation;
        this. bookYear = bookYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorInformation() {
        return this.authorInformation;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
}
