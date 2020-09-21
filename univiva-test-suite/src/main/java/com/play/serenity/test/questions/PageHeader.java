package com.play.serenity.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class PageHeader implements Question<String> {

  private Target header;

  private PageHeader(Target header) {
    this.header = header;
  }

  @Override
  public String answeredBy(Actor actor) {
    return Text.of(header).viewedBy(actor).asString();
  }

  public static PageHeader displayed(Target header) {
    return new PageHeader(header);
  }

}
