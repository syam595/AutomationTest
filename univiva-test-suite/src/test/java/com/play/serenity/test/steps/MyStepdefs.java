package com.play.serenity.test.steps;

import com.play.serenity.test.tasks.EnterCredentials;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.play.serenity.test.tasks.OpenTheWebApp;
import com.play.serenity.test.tasks.SetCookiesPreference;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MyStepdefs extends StepDefinitionBase{
    @Given("^Joan has opened univiva web application$")
    public void joanHasOpenedUnivivaWebapp() {
        theActorInTheSpotlight()
                .wasAbleTo(OpenTheWebApp.withNoLogin(testProperties.getWebAppUrl()));

    }

    @When("^she enters valid credentials$")
    public void sheEntersValidCredentials() throws Throwable {
        String email= testProperties.getEmail();
        String password=testProperties.getPassword();
        theActorInTheSpotlight()
                .attemptsTo(
                        SetCookiesPreference.asAcceptAllCookies(),
                        EnterCredentials.withValues(email, password));
    }

    @Then("^user homepage is displayed$")
    public void user_homepage_is_displayed() {

    }

}

