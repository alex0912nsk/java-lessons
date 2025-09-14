package korona.bk.modul2.homework.task2;

import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private final String text;

    public Book(String title, Author author, String text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, text);
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", text='" + text + '\'' +
                '}';
    }
}
