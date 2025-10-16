package korona.bk.modul2.homework.task3.validation;

public class FirstNameValidator implements Validator{
    @Override
    public void validate(String firstName) {
        if (!firstName.matches("\\D+")) {
            throw new IllegalArgumentException(firstName + " - имя не может содержать цифр");
        }
        if (firstName.length() > 50 || firstName.length() < 2) {
            throw new IllegalArgumentException(firstName + " - имя не может быть меньше 2 и больше 50 символов");
        }
    }
}
