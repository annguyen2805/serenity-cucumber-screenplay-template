package com.serenity.demo.task;

import com.serenity.demo.ui.ApplicationHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Start implements Task {
    private ApplicationHomePage applicationHomePage;

    public static Start toDoPage(){
        return Tasks.instrumented(Start.class);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(applicationHomePage)
        );
    }
}
