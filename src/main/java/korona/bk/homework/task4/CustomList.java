package korona.bk.homework.task4;

import java.lang.invoke.WrongMethodTypeException;
import java.util.Arrays;
import java.util.Objects;

public class CustomList {

    private Object[] array;

    public CustomList(Object[] array) {
        this.array = array;
    }

    public CustomList() {
        this.array = null;
    }

    public Object[] getArray() {
        return array;
    }

    public void append(Object o) {
        if (array == null) {
            array = new Object[]{o};
        } else if ((o != null ? array[0].getClass() : null) == (o != null ? o.getClass() : null)) {
            Object[] newArray = new Object[array.length + 1];
            System.arraycopy(this.array, 0, newArray, 0, array.length);
            newArray[array.length] = o;
            array = newArray;
        } else {
            throw new WrongMethodTypeException("Несоответствие классов");
        }
    }

    /**
     * @param o - добавляемое значение
     * @return true, если значение уникально и добавлено, иначе false
     * @throws WrongMethodTypeException если переданный Object не соответствует классу CustomList
     */
    public boolean appendOnlyUnique(Object o) {
        if (array == null) {
            array = new Object[]{o};
        } else if ((o != null ? array[0].getClass() : null) == (o != null ? o.getClass() : null)) {
            if (this.checkUnique(o)) {
                Object[] newArray = new Object[array.length + 1];
                System.arraycopy(this.array, 0, newArray, 0, array.length);
                newArray[array.length] = o;
                array = newArray;
            } else {
                return false;
            }
        } else {
            throw new WrongMethodTypeException("Несоответствие классов");
        }
        return true;
    }

    public void append(Object[] o) {
        if (array == null) {
            array = o;
        } else if (o != null && array[0].getClass() == o[0].getClass()) {
            Object[] newArray = new Object[array.length + o.length];
            System.arraycopy(array, 0, newArray, 0, array.length);
            System.arraycopy(o, 0, newArray, array.length, o.length);
            array = newArray;
        } else {
            throw new WrongMethodTypeException("Несоответствие классов");
        }
    }

    public void appendOnlyUnique(Object[] o) {
        for (Object obj : o) {
            this.appendOnlyUnique(obj);
        }
    }

    public void append(CustomList cstmL) {
        this.append(cstmL.array);
    }

    public void appendOnlyUnique(CustomList cstmL) {
        this.appendOnlyUnique(cstmL.array);
    }

    /**
     * @param index - индекс удаляемого значения
     * @return true, если элемент найден и удален, false если небыло такого элемента
     */
    public boolean delete(int index) {
        if (index > array.length) {
            return false;
        }
        Object[] newArray = new Object[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, newArray.length - index);
        array = newArray;
        return true;
    }

    /**
     * @param value - удаляемое значение
     * @return true, если элемент найден и удален, false если небыло такого элемента
     */
    public boolean delete(Object value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                delete(i);
                return true;
            }
        }
        return false;
    }

    private boolean checkUnique(Object o) {
        if (this.array != null) {
            for (Object object : this.array) {
                if (object.equals(o)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomList that = (CustomList) o;
        return Objects.deepEquals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "CustomList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
