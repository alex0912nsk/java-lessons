package korona.bk.modul2.homework.task3;

public class Exercise1 {

    public static void main(String[] args) {
        Library library = new Library("library.txt");
        System.out.println("\nпервая библиотека");
        System.out.println(library);

        //нет такого файла
        Library libraryErr = new Library("library.txttxt");

        //файл с ошибками
        Library libraryErr2 = new Library("libraryWrong.txt");
        System.out.println("\nвторая библиотека");
        System.out.println(libraryErr2);
    }
}