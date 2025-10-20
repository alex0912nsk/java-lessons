package korona.bk.modul2.homework.task3;

import java.time.Year;
import java.util.MissingFormatArgumentException;

public class DefaultValidator implements Validator{

    @Override
    public int birthYear(int year) {
        int currentYear = Year.now().getValue();
        if (year > currentYear) {
            throw new IllegalArgumentException(year + " - год рождения не может быть больше " + currentYear);
        }
        return year;
    }

    @Override
    public int birthYear(String year) {
        if (!year.matches("\\d+")) {
            throw new NumberFormatException(year + " - год рождения может содержать только цифры");
        }
        return birthYear(Integer.parseInt(year));
    }

    @Override
    public String firstName(String firstName) {
        if (!firstName.matches("\\D+")) {
            throw new IllegalArgumentException(firstName + " - имя не может содержать цифр");
        }
        if (firstName.length() > 50 || firstName.length() < 2) {
            throw new IllegalArgumentException(firstName + " - имя не может быть меньше 2 и больше 50 символов");
        }
        return firstName;
    }

    @Override
    public String lastName(String lastName) {
        if (!lastName.matches("\\D+")) {
            throw new IllegalArgumentException(lastName + " - фамилия не может содержать цифр");
        }
        if (lastName.length() > 50 || lastName.length() < 2) {
            throw new IllegalArgumentException(lastName + " - фамилия не может быть меньше 2 и больше 50 символов");
        }
        return lastName;
    }

    @Override
    public String[] elementCountForBookString(String line, String fileSeparator, int count) {
        String[] bookArray = line.split(fileSeparator);
        if (bookArray.length != count) {
            throw new MissingFormatArgumentException("Неверный формат строки '" + line + "', должно быть 'Имя" + fileSeparator + "Фамилия" + fileSeparator + "год рождения" + fileSeparator + "название книги" + fileSeparator + "текст книги'");
        }
        return bookArray;
    }
}