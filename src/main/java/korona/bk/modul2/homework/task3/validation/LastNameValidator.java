package korona.bk.modul2.homework.task3.validation;

public class LastNameValidator implements Validator{
    @Override
    public void validate(String lastName) {
        if (!lastName.matches("\\D+")) {
            throw new IllegalArgumentException(lastName + " - фамилия не может содержать цифр");
        }
        if (lastName.length() > 50 || lastName.length() < 2) {
            throw new IllegalArgumentException(lastName + " - фамилия не может быть меньше 2 и больше 50 символов");
        }
    }
}
