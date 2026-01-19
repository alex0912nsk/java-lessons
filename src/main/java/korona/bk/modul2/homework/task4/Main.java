package korona.bk.modul2.homework.task4;

import java.util.List;

import static korona.bk.modul2.homework.task4.enums.Action.*;
import static korona.bk.modul2.homework.task4.enums.ArtistType.*;

public class Main {
    public static void main(String[] args) {
        ArtistImpl leva = new ArtistImpl.ArtistBuilderImpl().setName("Лёва").setType(LION).setActionsForPredatorArtist().build();
        ArtistImpl kesha = new ArtistImpl.ArtistBuilderImpl().setName("Кеша").setType(PARROT).setActionsForFlyingArtist().build();
        ArtistHumanImpl oleg = new ArtistHumanImpl.ArtistHumanBuilderImpl().setName("Олег").setActionsForAnyArtist().removeAction(JUMP).setPets(List.of(leva, kesha)).build();

        ArtistImpl igor = new ArtistImpl.ArtistBuilderImpl().setName("Игорь").setType(DOLPHIN).setActionsForSwimmingArtist().build();
        ArtistHumanImpl leha = new ArtistHumanImpl.ArtistHumanBuilderImpl().setName("Леха").setActionsForAnyArtist().addAction(ROAR).setPet(igor).build();

        ArtistHumanImpl dima = new ArtistHumanImpl.ArtistHumanBuilderImpl().setName("Дима").setActionsForAnyArtist().addAction(FLIP).build();

        Performance performance1 = new Performance(oleg).setPerformancePartsRandom(8).addPerformancePart(kesha, SWIM).addPerformancePartRandom(leva);
        Performance performance2 = new Performance(leha).setPerformancePartsRandom(7).addPerformancePart(new PerformancePart(leva, ROAR));
        Performance performance3 = new Performance(dima).setPerformancePartsRandom(12);

        Program program = new Program(List.of(performance1, performance2, performance3));

        program.print(1);
    }
}
