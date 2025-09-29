package korona.bk.modul2.homework.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadFile {
    public static String FILE_SEPARATOR = ",";

    private ReadFile() {
    }

    static public List<Book> readLibraryFromFile(String fileName) {
        List<Book> books = new ArrayList<>();
        String fileFolder = "src/main/resources/";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileFolder + fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    Validate.validateFileBookString(line);
                    books.add(stringToBook(line));
                } catch (IllegalArgumentException e) {
                    System.err.println("ERROR " + e.getMessage());
                } catch (Exception e) {
                    System.err.println("ERROR неизвестная ошибка" + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR не нашел файл " + fileName);
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
