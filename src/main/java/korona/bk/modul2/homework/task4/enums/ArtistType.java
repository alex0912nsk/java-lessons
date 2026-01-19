package korona.bk.modul2.homework.task4.enums;

public enum ArtistType {
    PARROT("ПОПУГАЙ"),
    TIGER("ТИГР"),
    LION("ЛЕВ"),
    MONKEY("ОБЕЗЬЯНА"),
    PANTHER("ПАНТЕРА"),
    PENGUIN("ПИНГВИН"),
    OSTRICH("СТРАУС"),
    KILLER_WHALE("КАСАТКА"),
    DOLPHIN("ДЕЛЬФИН"),
    HIPPOPOTAMUS("БЕГЕМОТ"),
    BEAR("МЕДВЕДЬ"),
    HUMAN("ЧЕЛОВЕК");

    private final String artist;

    ArtistType(String action) {
        this.artist = action;
    }

    public String getArtist() {
        return artist;
    }
}
