package korona.bk.modul2.homework.task3.validation;

import korona.bk.modul2.homework.task3.FileLibraryReader;

import java.util.MissingFormatArgumentException;

public class FileLibraryStringValidator implements Validator{
    @Override
    public void validate(String line) {
        String fileSeparator = FileLibraryReader.getFileSeparator();
        String[] bookArray = line.split(fileSeparator);
        if (bookArray.length != 5) {
            throw new MissingFormatArgumentException("Неверный формат строки '" + line + "', должно быть 'Имя" + fileSeparator + "Фамилия" + fileSeparator + "год рождения" + fileSeparator + "название книги" + fileSeparator + "текст книги'");
        }
    }
}
