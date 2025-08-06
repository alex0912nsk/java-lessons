package korona.bk.modul1.homework.task5.interfaces;

import korona.bk.modul1.homework.task5.CustomList;
import korona.bk.modul1.homework.task5.enums.ArtistClass;
import korona.bk.modul1.homework.task5.enums.ArtistType;

public interface Artist {
    CustomList getActions();
    String getName();
    ArtistType getType();
    ArtistClass getArtistClass();
}
