package com.serenity.demo.task;

import com.serenity.demo.ui.DemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class AddItemToList implements Task {
    private String value;

    public AddItemToList(String value){
        this.value = value;
    }

    public static AddItemToList inHomePage(String value) {
        return Tasks.instrumented(AddItemToList.class, value);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(value).into(DemoPage.INPUT_TODO).thenHit(Keys.ENTER)
        );
    }
}
