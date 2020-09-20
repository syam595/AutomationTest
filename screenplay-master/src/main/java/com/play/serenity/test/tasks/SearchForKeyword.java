package com.play.serenity.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.thucydides.core.annotations.Step;

import static com.play.serenity.test.ui.GoogleHomePage.SEARCH_BOX;
import static com.play.serenity.test.ui.GoogleHomePage.SEARCH_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchForKeyword implements Task {

    private String keyword;

    public SearchForKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    @Step("{0} filters the stocklist with value #quickAddFilter")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Type.theValue(keyword).into(SEARCH_BOX),
                Click.on(SEARCH_BUTTON)
        );
    }

    public static SearchForKeyword withValue(String keyword) {
        return instrumented(SearchForKeyword.class, keyword);
    }
}
