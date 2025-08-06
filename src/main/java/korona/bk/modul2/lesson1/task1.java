package korona.bk.modul2.lesson1;

import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<Person> personBk = new ArrayList<>();
        List<Person> personBd = new ArrayList<>();
        personBk.add(new Person("Малиновский", "Игорь", Platform.QA));
        personBk.add(new Person("Васильев", "Алексей", Platform.JAVA));
        personBk.add(new Person("Мышковец", "Дмитрий", Platform.ORACLE));
        Team bk = new Team("БК", personBk);
        personBd.add(new Person("Сейко", "Олег", Platform.JAVA));
        personBd.add(new Person("Шуманский", "Юрий", Platform.QA));
        personBd.add(new Person("Ксендзов", "Леонид", Platform.ORACLE));
        Team bd = new Team("БД", personBd);
        System.out.println(bk);
        System.out.println(bd);
        System.out.println(bd.getPersonByPlatform(Platform.QA));
        bd.deletePerson(new Person("Ксендзов", "Леонид", Platform.ORACLE));
        bd.addNewPerson(new Person("Соколовский", "Артём", Platform.QA));
        System.out.println(bd);
        System.out.println(bd.getPersonByPlatform(Platform.QA));
    }
}
