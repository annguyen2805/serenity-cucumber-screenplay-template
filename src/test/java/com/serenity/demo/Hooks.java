package com.serenity.demo;


import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.ParameterType;

public class Hooks {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
