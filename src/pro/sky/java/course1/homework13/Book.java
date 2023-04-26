package pro.sky.java.course1.homework13;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author authorInformation;
    private int bookYear;

    public Book(Author authorInformation, String bookName, int bookYear) {
        this.bookName = bookName;
        this.authorInformation = authorInformation;
        this.bookYear = bookYear;
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

    @Override
    public String toString() {
        return authorInformation.toString() + ". Книга - <<" + this.bookName + ">> " + this.bookYear + " года выпуска.";
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName == book.bookName && authorInformation.equals(book.authorInformation) && bookYear == book.bookYear;
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorInformation, bookYear);
    }
}
