package com.play.serenity.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import com.play.serenity.test.ui.GoogleHomePage;
import com.play.serenity.test.ui.UnivivaHomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheWebApp implements Task {

    private UnivivaHomePage uniHomePage;
    private String url;

    public OpenTheWebApp(String url) {
        this.url = url;
    }

    @Override
    @Step("{0} opens the univiva home page")
    public <T extends Actor> void performAs(T actor) {
        String urlNavigation = url;

        uniHomePage.setDefaultBaseUrl(urlNavigation);
        actor.attemptsTo(
                Open.browserOn().the(uniHomePage)
        );

    }

    public static OpenTheWebApp withNoLogin(String url) {
        return (OpenTheWebApp) instrumented(OpenTheWebApp.class, url);
    }
}