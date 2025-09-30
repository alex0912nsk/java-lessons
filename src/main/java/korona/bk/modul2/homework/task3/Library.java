package korona.bk.modul2.homework.task3;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books;

    public Library(Book book) {
        books = new ArrayList<>();
        books.add(book);
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public Library() {
        books = FileReader.readLibraryFromFile();
    }

    /**
     * @param book - добавляемое значение
     * @return true, если значение уникально и добавлено, иначе false
     */
    public boolean addBook(Book book) {
        if (books.contains(book)) {
            return false;
        } else {
            books.add(book);
            return true;
        }
    }

    public void addBooks(List<Book> books) {
        for (Book book : books) {
            if (!this.books.contains(book)) {
                this.books.add(book);
            }
        }
    }

    public Book findByAuthorAndTitle(Author author, String title) {
        Book searchingBook = new Book(title, author, "");
        return books.get(books.indexOf(searchingBook));
    }

    public List<Book> findByAuthor(Author author) {
        List<Book> filtred = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                filtred.add(book);
            }
        }
        return filtred;
    }

    public boolean delete(int index) {
        if (index >= books.size()) {
            return false;
        } else {
            books.remove(index);
            return true;
        }
    }

    public boolean delete(Book book) {
        return books.remove(book);
    }

    @Override
    public String toString() {
        return "Library{" + "books=" + books + '}';
    }
}