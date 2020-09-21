package com.play.serenity.test.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://local")
public class UnivivaHomePage extends PageObject {

    public static final String TITLE = "Univia Home Page";

    public static final Target EMAIL = Target
            .the("Email")
            .locatedBy("//*[@id='email']");


    public static final Target PASSWORD = Target
            .the("Password")
            .locatedBy("//*[@id=\'passwordField-1\']");

    public static final Target LOGIN_BUTTON = Target
            .the("Login Button")
            .locatedBy("//*[@id=\'app\']/div[2]/div[1]/div/form/button");

}
