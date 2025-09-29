package korona.bk.modul2.homework.task3;

import java.time.Year;
import java.util.MissingFormatArgumentException;

import static korona.bk.modul2.homework.task3.ReadFile.FILE_SEPARATOR;

public class Validate {
    private Validate() {
    }

    public static void validateBirthYear(int year) {
        int currentYear = Year.now().getValue();
        if (year > currentYear) {
            throw new IllegalArgumentException(year + " - год рождения не может быть больше " + currentYear);
        }
    }

    public static void validateBirthYear(String year) {
        if (!year.matches("\\d+")) {
            throw new NumberFormatException(year + " - год рождения может содержать только цифры");
        }
        validateBirthYear(Integer.parseInt(year));
    }

    public static void validateFirstName(String firstName) {
        if (!firstName.matches("\\D+")) {
            throw new IllegalArgumentException(firstName + " - имя не может содержать цифр");
        }
        if (firstName.length() > 50 || firstName.length() < 2) {
            throw new IllegalArgumentException(firstName + " - имя не может быть меньше 2 и больше 50 символов");
        }
    }

    public static void validateLastName(String lastName) {
        if (!lastName.matches("\\D+")) {
            throw new IllegalArgumentException(lastName + " - фамилия не может содержать цифр");
        }
        if (lastName.length() > 50 || lastName.length() < 2) {
            throw new IllegalArgumentException(lastName + " - фамилия не может быть меньше 2 и больше 50 символов");
        }
    }

    public static void validateFileBookString(String line) {
        String[] buffer = line.split(",");
        if (buffer.length != 5) {
            throw new MissingFormatArgumentException("Неверный формат строки '" + line + "', должно быть 'Имя" + FILE_SEPARATOR + "Фамилия" + FILE_SEPARATOR + "год рождения" + FILE_SEPARATOR + "название книги" + FILE_SEPARATOR + "текст книги'");
        }
        validateFirstName(buffer[0]);
        validateLastName(buffer[1]);
        validateBirthYear(buffer[2]);
    }
}
