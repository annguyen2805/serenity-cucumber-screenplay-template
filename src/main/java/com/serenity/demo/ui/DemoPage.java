package com.serenity.demo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DemoPage {

    public static final Target INPUT_TODO = Target.the("ToDo text box")
            .locatedBy(".new-todo");
    public static final Target ITEM_LIST = Target.the("item in list")
            .locatedBy(".todo-list label");
}
