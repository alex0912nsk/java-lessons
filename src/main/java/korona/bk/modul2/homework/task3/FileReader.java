package korona.bk.modul2.homework.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileReader {
    private final String fileSeparator = ",";
    private final String path;

    public FileReader(String path) {
        this.path = path;
    }

    public List<Book> readLibraryFromFile() {
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
        new Validator().elementCountForBookString(line, fileSeparator, 5);
        String[] buffer = line.split(fileSeparator);
        return new Book(buffer[3], new Author(buffer[1], buffer[0], Integer.parseInt(buffer[2])), buffer[4]);
    }
}
