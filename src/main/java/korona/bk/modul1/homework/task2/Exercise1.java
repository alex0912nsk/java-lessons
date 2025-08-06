package korona.bk.modul1.homework.task2;


public class Exercise1 {

    public static void main(String[] args) {
        int[] array = {4, 10, 3, 15, 6, 5};
        int sumResult = 8;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] + array[j] == sumResult) {
                    System.out.println("index1=" + i + ",index2=" + j);
                    return;
                }
            }
            if (i == array.length - 1) System.out.println("нет такой пары");
        }
    }
}
