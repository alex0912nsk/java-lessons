package korona.bk.homework.task5.models;

import korona.bk.homework.task5.CustomList;
import korona.bk.homework.task5.enums.ArtistClass;
import korona.bk.homework.task5.enums.ArtistType;
import korona.bk.homework.task5.enums.actions.FlyingActions;
import korona.bk.homework.task5.enums.actions.ForAllActions;
import korona.bk.homework.task5.enums.actions.PreadtorsActions;
import korona.bk.homework.task5.enums.actions.SwimmingActions;
import korona.bk.homework.task5.interfaces.Artist;

public class ArtistImpl implements Artist {
    private final CustomList actions;
    private final String name;
    private final ArtistType type;
    private final ArtistClass artistClass;

    public ArtistImpl(String name, ArtistClass artistClass) {
        this.name = name;
        this.type = getArtistTypeFromClass(artistClass);
        this.artistClass = artistClass;
        switch (type) {
            case ЛЕТАЮЩАЯ_ПТИЦА:
                actions = new CustomList(FlyingActions.values());
                break;
            case РЫБА:
                actions = new CustomList(SwimmingActions.values());
                break;
            case ХИЩНИК:
                actions = new CustomList(PreadtorsActions.values());
                break;
            default:
                actions = new CustomList(ForAllActions.values());
                break;
        }
    }

    private ArtistType getArtistTypeFromClass(ArtistClass artistClass) {
        switch (artistClass) {
            case PARROT:
                return ArtistType.ЛЕТАЮЩАЯ_ПТИЦА;
            case KILLER_WHALE:
            case DOLPHIN:
                return ArtistType.РЫБА;
            case TIGER:
            case LION:
            case PANTHER:
            case BEAR:
                return ArtistType.ХИЩНИК;
            case PENGUIN:
            case OSTRICH:
                return ArtistType.НЕЛЕТАЮЩАЯ_ПТИЦА;
            case HUMAN:
                return ArtistType.ЧЕЛОВЕК;
            default:
                return ArtistType.ДРУГОЕ_ЖИВОТНОЕ;
        }
    }

    @Override
    public CustomList getActions() {
        return actions;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArtistType getType() {
        return type;
    }

    @Override
    public ArtistClass getArtistClass() {
        return artistClass;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "actions=" + actions +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
