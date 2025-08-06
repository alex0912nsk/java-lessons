package korona.bk.modul1.homework.task1;

import java.util.Arrays;

public class Exercise1 {

    static int[] array = {5, 3, -7, -10, 8, 3};

    public static void main(String[] args) {
        Sort.sortBubbleAscent(array);
        System.out.println(Arrays.toString(array));
    }
}
