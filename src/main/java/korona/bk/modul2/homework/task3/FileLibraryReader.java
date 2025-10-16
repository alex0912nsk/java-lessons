package korona.bk.modul2.homework.task3;

import korona.bk.modul2.homework.task3.validation.FileLibraryStringValidator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileLibraryReader {
    private final static String fileSeparator = ",";
    private final String path;

    public FileLibraryReader(String path) {
        this.path = path;
    }

    public static String getFileSeparator() {
        return fileSeparator;
    }

    public List<Book> read() {
        List<Book> books = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    books.add(stringToBook(line));
                } catch (IllegalArgumentException e) {
                    System.err.println("ERROR " + e.getMessage());
                } catch (Exception e) {
                    System.err.println("ERROR неизвестная ошибка" + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR не нашел файл " + path);
        } catch (IOException e) {
            System.err.println("ERROR closing reader: " + e.getMessage());
        }
        return books;
    }

    private Book stringToBook(String line) {
        new FileLibraryStringValidator().validate(line);
        String[] bookArray = line.split(fileSeparator);
        return new Book(bookArray[3], new Author(bookArray[1], bookArray[0], bookArray[2]), bookArray[4]);
    }
}