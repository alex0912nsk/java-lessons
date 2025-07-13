package korona.bk.homework.task5.enums.actions;

import korona.bk.homework.task5.interfaces.ActionsEnum;

public enum SwimmingActions implements ActionsEnum {
    SWIM("плывет"),
    JUMP_OUT("выпрыгивает из воды"),
    SPLASH("брызгает на зрителей"),
    FLIP("делает сальто"),
    WALK("идет"),
    RUN("бежит"),
    JUMP("прыгает"),
    CATCH("ловит"),
    THROW("бросает"),
    THROW_UP("подкидывает");

    private final String action;

    SwimmingActions(String action) {
        this.action = action;
    }

    @Override
    public String getAction() {
        return action;
    }
}
