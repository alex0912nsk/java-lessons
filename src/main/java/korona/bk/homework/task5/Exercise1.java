package korona.bk.homework.task5;

import korona.bk.homework.task5.enums.ArtistClass;
import korona.bk.homework.task5.models.*;
import korona.bk.homework.task5.models.Number;

public class Exercise1 {
    public static void main(String[] args) {
        ArtistHumanImpl serega = new ArtistHumanImpl("Серега");

        ArtistImpl leva = new ArtistImpl("Лёва", ArtistClass.ЛЕВ);
        ArtistImpl kesha = new ArtistImpl("Кеша", ArtistClass.ПОПУГАЙ);
        ArtistHumanImpl oleg = new ArtistHumanImpl("Олег", new CustomList(new ArtistImpl[]{leva, kesha}));

        ArtistImpl potap = new ArtistImpl("Потап", ArtistClass.МЕДВЕДЬ);
        ArtistImpl igor = new ArtistImpl("Игорь", ArtistClass.ДЕЛЬФИН);
        ArtistImpl amur = new ArtistImpl("Амур", ArtistClass.ТИГР);
        ArtistHumanImpl leha = new ArtistHumanImpl("Леха", new CustomList(new ArtistImpl[]{potap, igor, amur}));

        Program program1 = new Program(new CustomList(new Number[]{new Number(serega, 12), new Number(oleg, 15), new Number(leha, 20)}));
        Program program2 = new Program(new CustomList(new Number[]{new Number(leha, 18), new Number(oleg, 10), new Number(serega, 15)}));
        System.out.println(program1.toString(1));
        System.out.println("\n");
        System.out.println(program2.toString(2));
    }
}