package korona.bk.modul2.homework.task4;

import korona.bk.modul2.homework.task4.enums.Action;
import korona.bk.modul2.homework.task4.interfaces.Artist;

import java.util.List;

import java.util.Objects;
import java.util.Random;

public class PerformancePart {
    private final Artist artist;
    private final Action action;

    public PerformancePart(Artist artist, Action action) {
        this.artist = artist;
        this.action = action;
    }

    public PerformancePart(Artist artist) {
        this.artist = artist;
        this.action = getRandomAction(artist.getActions());
    }

    public Action getAction() {
        return action;
    }

    public Artist getArtist() {
        return artist;
    }

    private Action getRandomAction(List<Action> list) {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PerformancePart performancePart = (PerformancePart) obj;
        return Objects.equals(artist, performancePart.artist) && action == performancePart.action;
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, action);
    }

    @Override
    public String toString() {
        return artist.getType().getArtist() + ' ' + artist.getName() + ' ' + action.getAction();
    }
}
