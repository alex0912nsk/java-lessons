package korona.bk.homework.task5.models;

import korona.bk.homework.task5.CustomList;
import korona.bk.homework.task5.enums.ArtistClass;
import korona.bk.homework.task5.interfaces.ArtistHuman;

public class ArtistHumanImpl extends ArtistImpl implements ArtistHuman {
    private final CustomList pets;

    public ArtistHumanImpl(String name, CustomList pets) {
        super(name, ArtistClass.HUMAN);
        this.pets = pets;
    }

    public ArtistHumanImpl(String name) {
        super(name, ArtistClass.HUMAN);
        this.pets = new CustomList();
    }

    @Override
    public CustomList getPets() {
        return pets;
    }

    public ArtistImpl getRandomArtist() {
        if (pets.isEmpty()) {
            return this;
        } else {
            int random = (int) (Math.random() * (pets.length() + 1));
            if (random == 0) {
                return this;
            } else {
                return (ArtistImpl) pets.getRandomValue();
            }
        }
    }
}
