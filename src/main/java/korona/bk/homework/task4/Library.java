package korona.bk.homework.task4;


public class Library {

    private final CustomList books;

    public Library(Book book) {
        books = new CustomList(new Book[]{book});
    }

    public Library(Book[] books) {
        this.books = new CustomList(books);
    }

    public Library() {
        books = new CustomList();
    }

    /**
     * @param book - добавляемое значение
     * @return true, если значение уникально и добавлено, иначе false
     */
    public boolean addBook(Book book) {
        return books.appendOnlyUnique(book);
    }

    public void addBook(Book[] books) {
        this.books.appendOnlyUnique(books);
    }

    public void addBook(CustomList books) {
        this.books.appendOnlyUnique(books);
    }

    public Book findByAuthorAndTitle(Author author, String title) {
        Book searchingBook = new Book(title, author, "");
        for (Object book : books.getArray()) {
            if (book.equals(searchingBook)) {
                return (Book) book;
            }
        }
        return null;
    }

    public CustomList findByAuthor(Author author) {
        CustomList filtred = new CustomList();
        for (Object book : books.getArray()) {
            if (((Book) book).getAuthor().equals(author)) {
                filtred.append(book);
            }
        }
        return filtred;
    }

    public boolean delete(int index) {
        return books.delete(index);
    }

    public boolean delete(Book book) {
        return books.delete(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
