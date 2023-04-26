package pro.sky.java.course1.homework12;

public class Main {
    public static void main(String[] args) {

//        Первая книга
        Author author1 = new Author("Толстой", "Лев Николаевич");
        Book book1 = new Book(author1, "Война и мир", 1867);
        System.out.println("Автор - " + author1.getAuthorSurname() + " " + author1.getAuthorName() + ". Книга - <" +
                book1.getBookName() + "> " + book1.getBookYear() + " года выпуска.");

//        Вторая книга
        Author author2 = new Author("Чехов", "Антон Павлович");
        Book book2 = new Book(author2, "Вишневый сад", 1904);
        System.out.println("Автор - " + author2.getAuthorSurname() + " " + author2.getAuthorName() + ". Книга - <" +
                book2.getBookName() + "> " + book2.getBookYear() + " года выпуска.");

//        Меняем год выпуска второй книги
        book2.setBookYear(1903);
        System.out.println("Автор - " + author2.getAuthorSurname() + " " + author2.getAuthorName() + ". Книга - <" +
                book2.getBookName() + "> " + book2.getBookYear() + " года выпуска.");

//        Третья книга
        Author author3 = new Author("Достовеский", "Федор Михайлович");
        Book book3 = new Book(author3, "Преступление и наказание", 1866);
        System.out.println("Автор - " + author3.getAuthorSurname() + " " + author3.getAuthorName() + ". Книга - <" +
                book3.getBookName() + "> " + book3.getBookYear() + " года выпуска.");
    }
//    В классе Book объявил ранее созданный (в классе Author) объект Author. Ниже создал геттер getAuthorInformation(),
//    который в Main не получается использовать...Консоль выдвет набор символов вместо ФИО автора...По итогу этот метод
//    я вообще нигде не вызвал. Вместо этого в sout пришлось вызывать геттеры из класса Author.
//    Зачем тогда вообще нужно было Author объявлять в классе Book (так указано в задании)?
//    Как это исправить? И нужно ли?
}

