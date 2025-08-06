package korona.bk.modul1.homework.task5.enums.actions;

import korona.bk.modul1.homework.task5.interfaces.ActionsEnum;

public enum ForAllActions implements ActionsEnum {
    WALK("идет"),
    RUN("бежит"),
    JUMP("прыгает"),
    CATCH("ловит"),
    THROW("бросает"),
    THROW_UP("подкидывает");

    private final String action;

    ForAllActions(String action) {
        this.action = action;
    }

    @Override
    public String getAction() {
        return action;
    }
}
