package korona.bk.modul2.homework.task4;

import java.util.List;

public class Program {
    private final List<Performance> performances;

    public Program(List<Performance> performances) {
        this.performances = performances;
    }

    public void print(int programCount) {
        String result = "Запуск программы #" + programCount + ":\n";
        for (int i = 0; i < performances.size(); i++) {
            result = result + "Номер " + (i + 1) + ":\n";
            result = result + performances.get(i) + "\n";
        }
        result = result + "Завершаем программу #" + programCount + ".\n";
        System.out.println(result);
    }
}
