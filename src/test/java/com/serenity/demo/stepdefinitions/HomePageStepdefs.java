package com.serenity.demo.stepdefinitions;


import com.serenity.demo.question.ListItemToDo;
import com.serenity.demo.task.AddItemToList;
import com.serenity.demo.task.Start;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class HomePageStepdefs {
    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{actor} start home page")
    public void ramaIsLookingAtHisTODOList(Actor actor) {
        actor.attemptsTo(
                Start.toDoPage()
        );
    }

    @When("{actor} adds {string} to the list")
    public void heAddsToTheList(Actor actor, String value) {
        actor.attemptsTo(
                AddItemToList.inHomePage(value)
        );
    }

    @Then("{actor} sees {string} as an item in the TODO list")
    public void heSeesAsAnItemInTheTODOList(Actor actor, String value) {
        actor.should(
                seeThat(ListItemToDo.isDisplayed(), equalToIgnoringCase(value))
        );
    }
}
