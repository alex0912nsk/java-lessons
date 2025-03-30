package korona.bk.homework.task3;

public class Exercise2 {
    public static void main(String[] args) {
        CustomList newString = new CustomList(new String[]{"Катя", "Галя", "Олег", "Даша"});
        newString.append("Марина");
        System.out.println(newString);
        newString.append(new String[]{"Виолета", "Анжела"});
        System.out.println(newString);
        newString.delete(3);
        System.out.println(newString);
        newString.delete("Марина");
        System.out.println(newString);

        CustomList newString2 = new CustomList();
        newString2.append("Марина");
        System.out.println(newString2);

        CustomList newString3 = new CustomList();
        newString3.append(new Integer[]{3, 7, 10, 15});
        System.out.println(newString3);
    }
}
