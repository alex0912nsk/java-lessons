package korona.bk.homework.task4;

import java.time.LocalDate;

public class Exercise1 {

    public static void main(String[] args) {
        Author author1 = new Author("Сейко", "Олег", LocalDate.of(1990, 1, 16));
        Author author2 = new Author("Малиновский", "Игорь", LocalDate.of(1894, 9, 18));
        Author author3 = new Author("Васильев", "Алексей", LocalDate.of(1994, 12, 9));
        Library library = new Library();

        library.addBook(new Book("Java для чайников", author1, "Все люди делятся на примитивы и объекты"));
        library.addBook(new Book[]{
                new Book("Java для чайников", author1, "Все люди делятся на примитивы и объекты"),
                new Book("Java для чайников 2", author1, "В основном примитивы"),
                new Book("Java для чайников 3", author1, "Игорь привет"),
                new Book("Кто здесь примитив?", author2, "О, Олег, здароооова!"),
                new Book("Кто здесь примитив?!", author2, "Вчера такого сома поймал"),
                new Book("Кто здесь примитив? Так и не ответили", author2, "Больше чем у Лехи в его рассказах"),
                new Book("Ну и хер с вами", author2, "Ага, сантиметров 5, не меньше"),
                new Book("Тестирование для чайников", author3, "Я вам не мешаю?"),
                new Book("Никто не примитив", author2, "Не, все нормально"),
                new Book("Примитивов осуждаем", author2, "Я Олегу своего сома показывал"),
        });
        System.out.println(library);
        System.out.println("\nА сейчас будет конкретная книга");
        System.out.println(library.findByAuthorAndTitle(author1, "Java для чайников"));
        System.out.println("\nА сейчас будут все книги автора");
        System.out.println(library.findByAuthor(author2));
    }
}
