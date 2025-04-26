package korona.bk.homework.task5.enums.actions;

import korona.bk.homework.task5.interfaces.ActionsEnum;

public enum ForAllActions implements ActionsEnum {
    ИДТИ("идет"),
    БЕЖАТЬ("бежит"),
    ПРЫГАТЬ("прыгает"),
    ЛОВИТЬ("ловит"),
    БРОСАТЬ("бросает"),
    ПОДКИДЫВАТЬ("подкидывает");

    private final String action;

    ForAllActions(String action) {
        this.action = action;
    }

    @Override
    public String getAction() {
        return action;
    }
}
