package korona.bk.modul2.homework.task2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    //private final Map<Author, List<Book>> authorBooks;
    private final Map<Author, List<Book>> books;


    public Library(Book book) {
        List<Book> booksList = new ArrayList<>();
        booksList.add(book);
        books = new HashMap<>();
        books.put(book.getAuthor(), booksList);
    }

    public Library(List<Book> books) {
        this.books = new HashMap<>();
        addBooks(books);
    }

    public Library() {
        books = new HashMap<>();
    }

    /**
     * @param book - добавляемое значение
     * @return true, если значение уникально и добавлено, иначе false
     */
    public boolean addBook(Book book) {
        if (books.containsKey(book.getAuthor())) {
            List<Book> booksList = books.get(book.getAuthor());
            if (booksList.contains(book)) {
                return false;
            } else {
                booksList.add(book);
                return true;
            }
        } else {
            List<Book> booksList = new ArrayList<>();
            booksList.add(book);
            books.put(book.getAuthor(), booksList);
            return true;
        }
    }

    public void addBooks(List<Book> books) {
        for (Book book : books) {
            addBook(book);
        }
    }

    public Book findByAuthorAndTitle(Author author, String title) {
        Book searchingBook = new Book(title, author, "");
        List<Book> booksList = books.get(author);
        return booksList.get(booksList.indexOf(searchingBook));
    }

    public List<Book> findByAuthor(Author author) {
        return books.get(author);
    }

    public Author findAuthorByBookTitle(String bookTitle){
        for (List<Book> booksList : books.values()){
            for (Book book : booksList){
                if(book.getTitle().equals(bookTitle)){
                    return book.getAuthor();
                }
            }
        }
        return null;
    }

    public boolean delete(Book book) {
        return findByAuthor(book.getAuthor()).remove(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
