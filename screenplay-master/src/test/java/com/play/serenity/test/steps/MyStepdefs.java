package com.play.serenity.test.steps;

import com.play.serenity.test.tasks.SearchForKeyword;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.play.serenity.test.tasks.OpenTheWebApp;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MyStepdefs extends StepDefinitionBase{
    @Given("^Joan has opened google page$")
    public void joanHasOpenedGooglePage() {
        theActorInTheSpotlight()
                .wasAbleTo(OpenTheWebApp.withNoLogin(testProperties.getWebAppUrl()));

    }

    @When("^she search for a keyword \"([^\"]*)\"$")
    public void sheSearchForAKeyword(String keyword) throws Throwable {
        theActorInTheSpotlight()
                .attemptsTo(SearchForKeyword.withValue(keyword));
    }

    @Then("^results are displayed$")
    public void results_are_displayed() {

    }
}

