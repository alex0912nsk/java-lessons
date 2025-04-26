package korona.bk.homework.task5.enums.actions;

import korona.bk.homework.task5.interfaces.ActionsEnum;

public enum PreadtorsActions implements ActionsEnum {
    РЫЧАТЬ("рычит"),
    ВСТАВАТЬ("встает на задние лапы"),
    ПАСТЬ("открывает пасть"),
    ИДТИ("идет"),
    БЕЖАТЬ("бежит"),
    ПРЫГАТЬ("прыгает"),
    ЛОВИТЬ("ловит"),
    БРОСАТЬ("бросает"),
    ПОДКИДЫВАТЬ("подкидывает");

    private final String action;

    PreadtorsActions(String action) {
        this.action = action;
    }

    @Override
    public String getAction() {
        return action;
    }
}
