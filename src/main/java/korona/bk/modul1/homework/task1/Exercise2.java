package korona.bk.modul1.homework.task1;

import java.util.Arrays;

public class Exercise2 {

    static char[][] array = {{'з', 'г', 'д', 'a'}, {'ж', 'б', 'и', 'м'}, {'к', 'в', 'л', 'е'}};

    public static void main(String[] args) {
        Sort.sortBubbleAscent(array);
        for (char[] chars : array) {
            System.out.println(Arrays.toString(chars));
        }
    }
}
