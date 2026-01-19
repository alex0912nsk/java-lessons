package korona.bk.modul2.homework.task4;

import korona.bk.modul2.homework.task4.enums.ArtistType;
import korona.bk.modul2.homework.task4.enums.Action;
import static korona.bk.modul2.homework.task4.enums.Action.*;
import korona.bk.modul2.homework.task4.interfaces.Artist;
import korona.bk.modul2.homework.task4.interfaces.ArtistBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArtistHumanImpl implements Artist {
    private String name;
    private ArtistType type;
    private List<Action> actions;
    private List<ArtistImpl> pets;

    private ArtistHumanImpl() {
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

    private void setType() {
        this.type = ArtistType.HUMAN;
    }

    public List<Action> getActions() {
        return actions;
    }

    private void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<ArtistImpl> getPets() {
        return pets;
    }

    private void setPets(List<ArtistImpl> pets) {
        this.pets = pets;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ArtistHumanImpl artist = (ArtistHumanImpl) obj;
        return Objects.equals(name, artist.getName()) && Objects.equals(type, artist.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    public static class ArtistHumanBuilderImpl implements ArtistBuilder {
        private String name;
        private List<Action> actions = new ArrayList<>();
        private List<ArtistImpl> pets  = new ArrayList<>();

        public ArtistHumanBuilderImpl() {
        }

        public ArtistHumanBuilderImpl setName(String name){
            this.name = name;
            return this;
        }

        public ArtistHumanBuilderImpl setType(ArtistType type){
            return this;
        }

        public ArtistHumanBuilderImpl setAction(Action action){
            this.actions = List.of(action);
            return this;
        }

        public ArtistHumanBuilderImpl setActions(List<Action> actions){
            this.actions = actions;
            return this;
        }

        public ArtistHumanBuilderImpl addAction(Action action){
            this.actions.add(action);
            return this;
        }

        public ArtistHumanBuilderImpl addActions(List<Action> actions){
            this.actions.addAll(actions);
            return this;
        }

        public ArtistHumanBuilderImpl removeAction(Action action){
            this.actions.remove(action);
            return this;
        }

        public ArtistHumanBuilderImpl removeActions(List<Action> actions){
            this.actions.removeAll(actions);
            return this;
        }

        public ArtistHumanBuilderImpl setActionsForAnyArtist(){
            this.actions = getActionsForAny();
            return this;
        }

        public ArtistHumanBuilderImpl setActionsForFlyingArtist(){
            this.actions = getActionsForFlying();
            return this;
        }

        public ArtistHumanBuilderImpl setActionsForPredatorArtist(){
            this.actions = getActionsForPredator();
            return this;
        }

        public ArtistHumanBuilderImpl setActionsForSwimmingArtist(){
            this.actions = getActionsForSwimming();
            return this;
        }

        public ArtistHumanBuilderImpl setPets(List<ArtistImpl> pets) {
            this.pets = pets;
            return this;
        }

        public ArtistHumanBuilderImpl setPet(ArtistImpl pet) {
            this.pets = List.of(pet);
            return this;
        }

        private void checkBuildHasNotNull() {
            boolean flag = false;

            if (name == null) {
                flag = true;
                System.err.println("ERROR Имя не может быть null, не забудьте использовать " + this.getClass().getSimpleName() + ".setName(Sting name)");
            }
            if (actions == null || actions.isEmpty()) {
                flag = true;
                System.err.println("ERROR Список действий не может быть null, не забудьте использовать " + this.getClass().getSimpleName() + ".setActions(List<Action> actions) или другие методы setAction...");
            }
            if (flag){
                throw new NullPointerException("У артиста есть незаполненные поля");
            }
        }

        public ArtistHumanImpl build() {
            checkBuildHasNotNull();
            ArtistHumanImpl artistHuman = new ArtistHumanImpl();
            artistHuman.setName(name);
            artistHuman.setType();
            artistHuman.setActions(actions);
            artistHuman.setPets(pets);
            return artistHuman;
        }
    }
}
