package korona.bk.modul2.homework.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.MissingFormatArgumentException;

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
        books = new ArrayList<>();
    }

    public Library(String fileName) {
        books = new ArrayList<>();
        String fileFolder = "src/main/resources/";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileFolder + fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                books.add(stringToBook(line));
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR File not found: не нашел файл " + fileName);
        } catch (IOException e) {
            System.err.println("ERROR closing reader: " + e.getMessage());
        }
    }

    private Book stringToBook(String line) {
        try {
            String[] buffer = line.split(",");
            if (buffer.length != 5) {
                throw new MissingFormatArgumentException("Неверный формат файла в строке '" + line + "'");
            }
            int birthDate = Integer.parseInt(buffer[2]);
            if (birthDate > 2025) {
                throw new MissingFormatArgumentException("Неверный год рождения автора - " + buffer[2]);
            }
            Author author = new Author(buffer[1], buffer[0], birthDate);
            return new Book(buffer[3], author, buffer[4]);
        } catch (MissingFormatArgumentException | NumberFormatException e) {
            System.err.println("ERROR " + e.getMessage());
        } catch (Exception e) {
            System.err.println("ERROR неизвестная ошибка");
        }
        return null;
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