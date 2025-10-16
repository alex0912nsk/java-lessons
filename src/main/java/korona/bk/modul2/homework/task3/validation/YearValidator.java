package korona.bk.modul2.homework.task3.validation;

import java.time.Year;

public class YearValidator implements Validator{
    @Override
    public void validate(String year) {
        if (!year.matches("\\d+")) {
            throw new NumberFormatException(year + " - год рождения может содержать только цифры");
        }
        validate(Integer.parseInt(year));
    }

    public void validate(int year) {
        int currentYear = Year.now().getValue();
        if (year > currentYear) {
            throw new IllegalArgumentException(year + " - год рождения не может быть больше " + currentYear);
        }
    }
}
