package korona.bk.modul2.homework.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileReader {
    public static final String FILE_SEPARATOR = ",";
    private static final String LIBRARY_PATH = "src/main/resources/libraryWrong.txt";

    private FileReader() {
    }

    static public List<Book> readLibraryFromFile() {
        List<Book> books = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(LIBRARY_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    Validator.validateFileBookString(line);
                    books.add(stringToBook(line));
                } catch (IllegalArgumentException e) {
                    System.err.println("ERROR " + e.getMessage());
                } catch (Exception e) {
                    System.err.println("ERROR неизвестная ошибка" + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR не нашел файл " + LIBRARY_PATH);
        } catch (IOException e) {
            System.err.println("ERROR closing reader: " + e.getMessage());
        }
        return books;
    }

    static private Book stringToBook(String line) {
        String[] buffer = line.split(FILE_SEPARATOR);
        return new Book(buffer[3], new Author(buffer[1], buffer[0], Integer.parseInt(buffer[2])), buffer[4]);
    }
}
