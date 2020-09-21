package com.play.serenity.test.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://local")
public class UnivivaHomePage extends PageObject {

    public static final String TITLE = "Univia Home Page";

    public static final Target EMAIL = Target
            .the("Email")
            .locatedBy("//input[@id='email']");


    public static final Target PASSWORD = Target
            .the("Password")
            .locatedBy("//input[@id='passwordField-1']");

    public static final Target LOGIN_BUTTON = Target
            .the("Login Button")
            .locatedBy("//button[@type='submit']");

    public static final Target COOKIE_ACCEPT_BUTTON = Target
            .the("Cookie Accept All Button")
            .locatedBy("//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
}
