package korona.bk.modul1.homework.task5;

import korona.bk.modul1.homework.task5.enums.ArtistClass;
import korona.bk.modul1.homework.task5.models.ArtistHumanImpl;
import korona.bk.modul1.homework.task5.models.ArtistImpl;
import korona.bk.modul1.homework.task5.models.Number;
import korona.bk.modul1.homework.task5.models.Program;

public class Exercise1 {
    public static void main(String[] args) {
        ArtistHumanImpl serega = new ArtistHumanImpl("Серега");

        ArtistImpl leva = new ArtistImpl("Лёва", ArtistClass.LION);
        ArtistImpl kesha = new ArtistImpl("Кеша", ArtistClass.PARROT);
        ArtistHumanImpl oleg = new ArtistHumanImpl("Олег", new CustomList(new ArtistImpl[]{leva, kesha}));

        ArtistImpl potap = new ArtistImpl("Потап", ArtistClass.BEAR);
        ArtistImpl igor = new ArtistImpl("Игорь", ArtistClass.DOLPHIN);
        ArtistImpl amur = new ArtistImpl("Амур", ArtistClass.TIGER);
        ArtistHumanImpl leha = new ArtistHumanImpl("Леха", new CustomList(new ArtistImpl[]{potap, igor, amur}));

        Program program1 = new Program(new CustomList(new Number[]{new Number(serega, 12), new Number(oleg, 15), new Number(leha, 20)}));
        Program program2 = new Program(new CustomList(new Number[]{new Number(leha, 18), new Number(oleg, 10), new Number(serega, 15)}));
        System.out.println(program1.toString(1));
        System.out.println("\n");
        System.out.println(program2.toString(2));
    }
}