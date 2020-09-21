package com.play.serenity.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import com.play.serenity.test.ui.UnivivaHomePage;
import static com.play.serenity.test.ui.UnivivaHomePage.COOKIE_ACCEPT_BUTTON;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetCookiesPreference implements Task {

    public SetCookiesPreference() {

    }

    @Override
    @Step("{0} opens the issue compilation screen to url #url?issuePII=#issuePII&issn=#issn")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COOKIE_ACCEPT_BUTTON)
        );

    }

    public static SetCookiesPreference asAcceptAllCookies() {
        return (SetCookiesPreference) instrumented(SetCookiesPreference.class);
    }
}