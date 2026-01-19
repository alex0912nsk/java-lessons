package korona.bk.modul2.homework.task4.enums;

import java.util.ArrayList;
import java.util.List;

public enum Action {
    FLY("летит"),
    DIVE("пикирует"),
    WALK("идет"),
    RUN("бежит"),
    JUMP("прыгает"),
    CATCH("ловит"),
    THROW("бросает"),
    ROAR("рычит"),
    STAND_UP("встает на задние лапы"),
    JAWS("открывает пасть"),
    SWIM("плывет"),
    JUMP_OUT("выпрыгивает из воды"),
    SPLASH("брызгает на зрителей"),
    FLIP("делает сальто"),
    THROW_UP("подкидывает");

    private final String action;

    Action(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public static List<Action> getActionsForAny() {
        List<Action> list = new ArrayList<>();
        list.add(WALK);
        list.add(RUN);
        list.add(JUMP);
        list.add(CATCH);
        list.add(THROW);
        list.add(THROW_UP);
        return list;
    }

    public static List<Action> getActionsForFlying() {
        List<Action> list = new ArrayList<>();
        list.add(WALK);
        list.add(RUN);
        list.add(JUMP);
        list.add(CATCH);
        list.add(THROW);
        list.add(THROW_UP);
        list.add(FLY);
        list.add(DIVE);
        return list;
    }

    public static List<Action> getActionsForPredator() {
        List<Action> list = new ArrayList<>();
        list.add(WALK);
        list.add(RUN);
        list.add(JUMP);
        list.add(CATCH);
        list.add(THROW);
        list.add(THROW_UP);
        list.add(ROAR);
        list.add(STAND_UP);
        list.add(JAWS);
        return list;
    }

    public static List<Action> getActionsForSwimming() {
        List<Action> list = new ArrayList<>();
        list.add(WALK);
        list.add(RUN);
        list.add(JUMP);
        list.add(CATCH);
        list.add(THROW);
        list.add(THROW_UP);
        list.add(SWIM);
        list.add(JUMP_OUT);
        list.add(SPLASH);
        list.add(FLIP);
        return list;
    }
}
