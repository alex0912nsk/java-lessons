package korona.bk.modul1.homework.task1;

public final class Sort {

    private Sort() {
    }

    public static void sortBubbleAscent(int[] array) {
        boolean hasChange = true;
        while (hasChange) {
            hasChange = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    hasChange = true;
                }
            }
        }
    }

    public static void sortBubbleAscent(char[] array) {
        boolean hasChange = true;
        while (hasChange) {
            hasChange = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    hasChange = true;
                }
            }
        }
    }

    public static void sortBubbleAscent(char[][] array) {
        char[] sortArray = new char[array.length * array[0].length];
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array[i], 0, sortArray, i * array[i].length, array[i].length);
        }
        sortBubbleAscent(sortArray);
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(sortArray, i * array[i].length, array[i], 0, array[i].length);
        }
    }

    private static void swap(int[] a, int i, int j) {
        a[i] += a[j];
        a[j] = a[i] - a[j];
        a[i] -= a[j];
    }

    private static void swap(char[] a, int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
