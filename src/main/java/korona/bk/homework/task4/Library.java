package korona.bk.homework.task4;

import java.util.Arrays;

public class Library extends CustomList {

    public Library(Book book) {
        this.array = new Book[]{book};
    }

    public Library(Book[] books) {
        super(books);
    }

    public Library() {
        super();
    }

    public void append(Book book) {
        if (this.checkUniq(book)) {
            super.append(book);
        }
    }

    public void append(Book[] books) {
        for (Book book : books) {
            this.append(book);
        }
    }

    public Book findByAuthorAndTitle(Author author, String title) {
        Book searchingBook = new Book(title, author, "");
        for (Object book : this.array) {
            if (book.equals(searchingBook)) {
                return (Book) book;
            }
        }
        return null;
    }

    public Library findByAuthor(Author author) {
        Library filtred = new Library();
        for (Object book : this.array) {
            if (((Book) book).getAuthor().equals(author)) {
                filtred.append(book);
            }
        }
        return filtred;
    }

    @Override
    public String toString() {
        return "Library{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
