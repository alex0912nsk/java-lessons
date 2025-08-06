package korona.bk.modul1.homework.task5.models;

import korona.bk.modul1.homework.task5.CustomList;
import java.lang.invoke.WrongMethodTypeException;

public class Program {
    private final CustomList program;

    public Program(CustomList program) {
        if (program.getInnerClass() != Number.class) {
            throw new WrongMethodTypeException("Несоответствие классов или пустая программа");
        }
        this.program = program;
    }

    public String toString(int programNumber) {
        String result = "Запуск программы #" + programNumber + ":";
        int iterator = 1;
        for (Object number : program.getArray()) {
            result = result + "\nНомер " + iterator + ":\n" + number.toString();
            iterator++;
        }
        result = result + "\nЗавершаем программу #" + programNumber + ".";
        return result;
    }
}
