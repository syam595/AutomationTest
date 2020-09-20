package com.play.serenity.test.steps;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.WebdriverManager;
import org.springframework.stereotype.Component;

@Component
public class CommonStepdefs extends StepDefinitionBase{

    @Before
    public void set_the_stage(Scenario scenario) throws Exception {

        Serenity.setSessionVariable("scenario").to(scenario.getName());

        OnStage.setTheStage(new OnlineCast()).shineSpotlightOn("Joan");

        WebdriverManager webdriverManager = Serenity.getWebdriverManager();
        webdriverManager.clearCurrentDriver();
        webdriverManager.getWebdriver();

    }
}
