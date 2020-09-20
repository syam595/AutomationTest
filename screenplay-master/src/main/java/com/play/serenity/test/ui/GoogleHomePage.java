package com.play.serenity.test.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://local")
public class GoogleHomePage extends PageObject {

    public static final String TITLE = "Google Home Page";

    public static final Target SEARCH_BOX = Target
            .the("Search Box")
            .locatedBy("//input[@title='Search']");

    public static final Target SEARCH_BUTTON = Target
            .the("Search Button")
            .locatedBy("//input[@aria-label='Google Search']");

}
