package korona.bk.modul2.homework.task3;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;
    private final int birthDate;

    public Author(String firstName, String lastName, int birthDate) {
        Validator validator = new Validator();
        this.firstName = validator.firstName(firstName);
        this.lastName = validator.lastName(lastName);
        this.birthDate = validator.birthYear(birthDate);
    }

    public Author(String firstName, String lastName, String birthDate) {
        Validator validator = new Validator();
        this.firstName = validator.firstName(firstName);
        this.lastName = validator.lastName(lastName);
        this.birthDate = validator.birthYear(birthDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName) && Objects.equals(birthDate, author.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "(" + birthDate + ")";
    }
}