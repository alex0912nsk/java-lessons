package korona.bk.modul2.homework.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        Author author1 = new Author("Сейко", "Олег", LocalDate.of(1990, 1, 16));
        Author author2 = new Author("Малиновский", "Игорь", LocalDate.of(1894, 9, 18));
        Author author3 = new Author("Васильев", "Алексей", LocalDate.of(1994, 12, 9));
        Library library = new Library();

        library.addBook(new Book("Java для чайников", author1, "Все люди делятся на примитивы и объекты"));
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Java для чайников", author1, "Все люди делятся на примитивы и объекты"));
        listOfBooks.add(new Book("Java для чайников 2", author1, "В основном примитивы"));
        listOfBooks.add(new Book("Java для чайников 3", author1, "Игорь привет"));
        listOfBooks.add(new Book("Кто здесь примитив?", author2, "О, Олег, здароооова!"));
        listOfBooks.add(new Book("Кто здесь примитив?!", author2, "Вчера такого сома поймал"));
        listOfBooks.add(new Book("Кто здесь примитив? Так и не ответили", author2, "Больше чем у Лехи в его рассказах"));
        listOfBooks.add(new Book("Ну и хер с вами", author2, "Ага, сантиметров 5, не меньше"));
        listOfBooks.add(new Book("Тестирование для чайников", author3, "Я вам не мешаю?"));
        listOfBooks.add(new Book("Никто не примитив", author2, "Не, все нормально"));
        listOfBooks.add(new Book("Примитивов осуждаем", author2, "Я Олегу своего сома показывал"));
        library.addBooks(listOfBooks);

        System.out.println(library);
        System.out.println("\nА сейчас будет конкретная книга");
        System.out.println(library.findByAuthorAndTitle(author1, "Java для чайников"));
        System.out.println("\nА сейчас будут все книги автора");
        System.out.println(library.findByAuthor(author2));
        System.out.println("\nУдалим третью книгу");
        library.delete(2);
        System.out.println(library);
        System.out.println("\nУдалим Java для чайников 2");
        library.delete(new Book("Java для чайников 2", author1, "В основном примитивы"));
        System.out.println(library);
        if (!library.delete(8)) {
            System.out.println("\n9ю книгу не удалось удалить, ее не было:(");
        }
        if (!library.delete(new Book("Java для профессионалов", author1, "В основном примитивы"))) {
            System.out.println("\nТакой книги тоже не было");
        }
    }
}