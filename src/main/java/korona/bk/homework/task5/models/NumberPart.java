package korona.bk.homework.task5.models;

import korona.bk.homework.task5.interfaces.ActionsEnum;

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
        return artist.getArtistClass().toString() + ' ' +
                artist.getName() + ' ' +
                action.getAction();
    }
}
