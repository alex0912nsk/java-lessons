package korona.bk.modul2.homework.task4.interfaces;

import korona.bk.modul2.homework.task4.enums.Action;
import korona.bk.modul2.homework.task4.enums.ArtistType;

import java.util.List;

public interface Artist {
    String getName();
    ArtistType getType();
    List<Action> getActions();
    boolean equals(Object obj);
    int hashCode();
}
