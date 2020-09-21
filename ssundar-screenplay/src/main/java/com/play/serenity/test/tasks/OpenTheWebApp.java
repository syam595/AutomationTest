package com.play.serenity.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import com.play.serenity.test.ui.GoogleHomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheWebApp implements Task {

    private GoogleHomePage appHomePage;
    private String url;

    public OpenTheWebApp(String url) {
        this.url = url;
    }

    @Override
    @Step("{0} opens the issue compilation screen to url #url?issuePII=#issuePII&issn=#issn")
    public <T extends Actor> void performAs(T actor) {
        String urlNavigation = url;

        appHomePage.setDefaultBaseUrl(urlNavigation);
        actor.attemptsTo(
                Open.browserOn().the(appHomePage)
        );

    }

    public static OpenTheWebApp withNoLogin(String url) {
        return (OpenTheWebApp) instrumented(OpenTheWebApp.class, url);
    }
}