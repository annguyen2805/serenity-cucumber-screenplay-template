package com.serenity.demo.question;

import com.serenity.demo.ui.DemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ListItemToDo implements Question<String> {

    public static ListItemToDo isDisplayed() {
        return new ListItemToDo();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DemoPage.ITEM_LIST).answeredBy(actor);
    }
}
