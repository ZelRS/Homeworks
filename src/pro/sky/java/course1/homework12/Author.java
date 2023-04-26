package pro.sky.java.course1.homework12;

public class Author {
    private final String authorName;
    private final String authorSurname;

    public Author(String surname,String name) {
        this.authorName = name;
        this.authorSurname = surname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }
}
