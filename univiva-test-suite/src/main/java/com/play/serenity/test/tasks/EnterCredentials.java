package com.play.serenity.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.thucydides.core.annotations.Step;

import static com.play.serenity.test.ui.GoogleHomePage.SEARCH_BOX;
import static com.play.serenity.test.ui.GoogleHomePage.SEARCH_BUTTON;
import static com.play.serenity.test.ui.UnivivaHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterCredentials implements Task {

    private String email;
    private String password;

    public EnterCredentials(String email, String password) {
        this.email = email;
        this.password= password;
    }

    @Override
    @Step("{0} filters the stocklist with value #quickAddFilter")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Type.theValue(email).into(EMAIL),
                Type.theValue(password).into(PASSWORD),
                Click.on(LOGIN_BUTTON)
        );
    }

    public static EnterCredentials withValues(String email, String password) {
        return instrumented(EnterCredentials.class, email, password);
    }
}
