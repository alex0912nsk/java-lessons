package korona.bk.modul2.homework.task3;

public class Exercise1 {

    public static void main(String[] args) {
        Library library = new Library("library.txt");
        System.out.println(library);

        //нет такого файла
        //Library libraryErr = new Library("library.txttxt");

        //неверный формат файла
        //Library libraryErr = new Library("libraryWrongFormat.txt");

        //неверный формат даты
        //Library libraryErr = new Library("libraryWrongDate.txt");

        //еще не родился
        //Library libraryErr = new Library("libraryIncorrectDate.txt");
    }
}