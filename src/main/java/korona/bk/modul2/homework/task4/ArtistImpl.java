package korona.bk.modul2.homework.task4;

import korona.bk.modul2.homework.task4.enums.ArtistType;
import korona.bk.modul2.homework.task4.enums.Action;
import korona.bk.modul2.homework.task4.interfaces.Artist;
import korona.bk.modul2.homework.task4.interfaces.ArtistBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static korona.bk.modul2.homework.task4.enums.Action.*;

public class ArtistImpl implements Artist {
    private String name;
    private ArtistType type;
    private List<Action> actions;

    private ArtistImpl() {
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public ArtistType getType() {
        return type;
    }

    private void setType(ArtistType type) {
        this.type = type;
    }

    public List<Action> getActions() {
        return actions;
    }

    private void setActions(List<Action> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ArtistImpl artist = (ArtistImpl) obj;
        return Objects.equals(name, artist.getName()) && Objects.equals(type, artist.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    public static class ArtistBuilderImpl implements ArtistBuilder {
        private String name;
        private ArtistType type;
        private List<Action> actions = new ArrayList<>();

        public ArtistBuilderImpl() {
        }

        public ArtistBuilderImpl setName(String name) {
            this.name = name;
            return this;
        }

        public ArtistBuilderImpl setType(ArtistType type) {
            this.type = type;
            return this;
        }

        public ArtistBuilderImpl setAction(Action action) {
            this.actions = List.of(action);
            return this;
        }

        public ArtistBuilderImpl setActions(List<Action> actions) {
            this.actions = actions;
            return this;
        }

        public ArtistBuilderImpl addAction(Action action) {
            this.actions.add(action);
            return this;
        }

        public ArtistBuilderImpl addActions(List<Action> actions) {
            this.actions.addAll(actions);
            return this;
        }

        public ArtistBuilderImpl removeAction(Action action) {
            this.actions.remove(action);
            return this;
        }

        public ArtistBuilderImpl removeActions(List<Action> actions) {
            this.actions.removeAll(actions);
            return this;
        }

        public ArtistBuilderImpl setActionsForAnyArtist() {
            this.actions = getActionsForAny();
            return this;
        }

        public ArtistBuilderImpl setActionsForFlyingArtist() {
            this.actions = getActionsForFlying();
            return this;
        }

        public ArtistBuilderImpl setActionsForPredatorArtist() {
            this.actions = getActionsForPredator();
            return this;
        }

        public ArtistBuilderImpl setActionsForSwimmingArtist() {
            this.actions = getActionsForSwimming();
            return this;
        }

        private void checkBuildHasNotNull() {
            boolean flag = false;

            if (name == null) {
                flag = true;
                System.err.println("ERROR Имя не может быть null, не забудьте использовать " + this.getClass().getSimpleName() + ".setName(Sting name)");
            }
            if (type == null) {
                flag = true;
                System.err.println("ERROR Тип не может быть null, не забудьте использовать " + this.getClass().getSimpleName() + ".setType(ArtistType type)");
            }
            if (actions == null || actions.isEmpty()) {
                flag = true;
                System.err.println("ERROR Список действий не может быть null, не забудьте использовать " + this.getClass().getSimpleName() + ".setActions(List<Action> actions) или другие методы setAction...");
            }
            if (flag){
                throw new NullPointerException("У артиста есть незаполненные поля");
            }
        }

        public ArtistImpl build() {
            checkBuildHasNotNull();
            ArtistImpl artist = new ArtistImpl();
            artist.setName(name);
            artist.setType(type);
            artist.setActions(actions);
            return artist;
        }
    }
}
