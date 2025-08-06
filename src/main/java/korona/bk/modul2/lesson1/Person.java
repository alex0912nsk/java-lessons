package korona.bk.modul2.lesson1;

import java.util.Objects;

public class Person {
    private final String firstName;
    private final String secondName;
    private final Platform platform;

    public Person(String firstName, String secondName, Platform platform) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.platform = platform;
    }

    public Platform getPlatform() {
        return platform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(secondName, person.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", platform='" + platform + '\'' +
                '}';
    }
}
