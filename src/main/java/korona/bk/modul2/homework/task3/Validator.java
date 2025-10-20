package korona.bk.modul2.homework.task3;

public interface Validator {
    int birthYear(int year);
    int birthYear(String year);
    String firstName(String firstName);
    String lastName(String lastName);
    String[] elementCountForBookString(String line, String fileSeparator, int count);
}
