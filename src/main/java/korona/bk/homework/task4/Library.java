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

    public void addBook(Book book) {
        if (books.checkUniq(book)) {
            books.append(book);
        }
    }

    public void addBook(Book[] books) {
        for (Book book : books) {
            this.addBook(book);
        }
    }

    public void addBook(CustomList books) {
        for (Object book : books.getArray()) {
            this.addBook((Book) book);
        }
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

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
