package korona.bk.homework.task5.enums.actions;

import korona.bk.homework.task5.interfaces.ActionsEnum;

public enum FlyingActions implements ActionsEnum {
    ЛЕТАТЬ("летит"),
    ПИКИРОВАТЬ("пикирует"),
    ИДТИ("идет"),
    БЕЖАТЬ("бежит"),
    ПРЫГАТЬ("прыгает"),
    ЛОВИТЬ("ловит"),
    БРОСАТЬ("бросает"),
    ПОДКИДЫВАТЬ("подкидывает");

    private final String action;

    FlyingActions(String action) {
        this.action = action;
    }

    @Override
    public String getAction() {
        return action;
    }
}
