package korona.bk.modul1.homework.task5.models;

import korona.bk.modul1.homework.task5.interfaces.ActionsEnum;

public class NumberPart {
    private final ArtistImpl artist;
    private final ActionsEnum action;

    public NumberPart(ArtistImpl artist, ActionsEnum action) {
        boolean flag = false;
        for (Object act : artist.getActions().getArray()) {
            if (act == action) {
                flag = true;
                break;
            }
        }
        if (flag) {
            this.artist = artist;
            this.action = action;
        } else {
            throw new AssertionError("Артист не делает таких действий");
        }
    }

    public NumberPart(ArtistImpl artist) {
        this.artist = artist;
        this.action = (ActionsEnum) artist.getActions().getRandomValue();
    }

    @Override
    public String toString() {
        return artist.getArtistClass().getArtist() + ' ' +
                artist.getName() + ' ' +
                action.getAction();
    }
}
