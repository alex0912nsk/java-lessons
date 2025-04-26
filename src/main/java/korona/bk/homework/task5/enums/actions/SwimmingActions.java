package korona.bk.homework.task5.enums.actions;

import korona.bk.homework.task5.interfaces.ActionsEnum;

public enum SwimmingActions implements ActionsEnum {
    ПЛЫТЬ("плывет"),
    ВЫПРЫГИВАТЬ("выпрыгивает из воды"),
    БРЫЗГАТЬСЯ("брызгает на зрителей"),
    САЛЬТО("делает сальто"),
    ИДТИ("идет"),
    БЕЖАТЬ("бежит"),
    ПРЫГАТЬ("прыгает"),
    ЛОВИТЬ("ловит"),
    БРОСАТЬ("бросает"),
    ПОДКИДЫВАТЬ("подкидывает");

    private final String action;

    SwimmingActions(String action) {
        this.action = action;
    }

    @Override
    public String getAction() {
        return action;
    }
}
