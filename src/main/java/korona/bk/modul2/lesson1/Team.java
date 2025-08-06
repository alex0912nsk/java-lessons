package korona.bk.modul2.lesson1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static korona.bk.modul2.lesson1.Platform.*;

public class Team {
    private final String name;
    private final List<Person> persons;
    private final Map<Platform, List<Person>> personsByPlatform = new HashMap<>();

    public Team(String name, List<Person> persons) {
        this.name = name;
        this.persons = persons;
        List<Person> qa = new ArrayList<>();
        List<Person> oracle = new ArrayList<>();
        List<Person> java = new ArrayList<>();
        for (Person person : persons) {
            if (person.getPlatform() == QA) {
                qa.add(person);
            }
            if (person.getPlatform() == ORACLE) {
                oracle.add(person);
            }
            if (person.getPlatform() == JAVA) {
                java.add(person);
            }
        }
        this.personsByPlatform.put(QA, qa);
        this.personsByPlatform.put(ORACLE, oracle);
        this.personsByPlatform.put(JAVA, java);
    }

    public void addNewPerson(Person person) {
        persons.add(person);
        List<Person> currentPersons = this.personsByPlatform.get(person.getPlatform());
        currentPersons.add(person);
    }

    public void deletePerson(Person person) {
        persons.remove(person);
        List<Person> currentPersons = this.personsByPlatform.get(person.getPlatform());
        currentPersons.remove(person);
    }

    public List<Person> getPersonByPlatform(Platform platform) {
        return this.personsByPlatform.get(platform);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", persons=" + persons +
                '}';
    }
}
