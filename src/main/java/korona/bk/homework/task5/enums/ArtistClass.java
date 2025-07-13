package korona.bk.homework.task5.enums;

public enum ArtistClass {
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

    ArtistClass(String action) {
        this.artist = action;
    }

    public String getArtist() {
        return artist;
    }
}
