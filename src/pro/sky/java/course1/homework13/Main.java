package pro.sky.java.course1.homework13;

public class Main {

    private static final Author[] authors = new Author[3];
    private static final Book[] books = new Book[3];

    public static void main(String[] args) {
        authors[0] = new Author("Толстой", "Лев Николаевич");
        authors[1] = new Author("Толстой", "Лев Николаевич");
        authors[2] = new Author("Достовеский", "Федор Михайлович");

        books[0] = new Book(authors[0], "Война и Мир", 1867);
        books[1] = new Book(authors[1], "Анна Каренина", 1877);
        books[2] = new Book(authors[2], "Преступление и наказание", 1866);

        printAuthorsRegister();
        separator();
        printBooksRegister();
        separator();
        isBooksEquals(0, 1);
        isAuthorsEquals(0,1);
        separator();
    }

    public static void isBooksEquals(int a, int b) {
        if (books[a].equals(books[b])) {
            System.out.println("Все данные этих книг абсолютно равны!");
        } else System.out.println("Данные этих книг чем-то отличаются!");
    }

    public static void isAuthorsEquals(int a, int b) {
        if (authors[a].equals(authors[b])) {
            System.out.println("У книг <<" + books[a].getBookName() + ">> и <<" + books[b].getBookName() +
                    ">> одинаковые авторы.");
        } else System.out.println("Авторы книг <<" + books[a].getBookName() + ">> и <<" +  books[b].getBookName() +
                ">> различаются.");
    }

    public static void printAuthorsRegister() {
        for (Author author : authors) {
            System.out.println(author);
        }
    }

    public static void printBooksRegister() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void separator() {
        System.out.println("=============================================");
    }
}
