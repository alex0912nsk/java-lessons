package korona.bk.modul2.homework.task4.interfaces;

import korona.bk.modul2.homework.task4.enums.Action;
import korona.bk.modul2.homework.task4.enums.ArtistType;

import java.util.List;

public interface ArtistBuilder {
    ArtistBuilder setName(String name);
    ArtistBuilder setType(ArtistType type);
    ArtistBuilder setAction(Action action);
    ArtistBuilder setActions(List<Action> actions);
    ArtistBuilder addAction(Action action);
    ArtistBuilder addActions(List<Action> actions);
    ArtistBuilder removeAction(Action action);
    ArtistBuilder removeActions(List<Action> actions);
    ArtistBuilder setActionsForAnyArtist();
    ArtistBuilder setActionsForFlyingArtist();
    ArtistBuilder setActionsForPredatorArtist();
    ArtistBuilder setActionsForSwimmingArtist();
    Artist build();
}
