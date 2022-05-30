package com.devexpress.reto.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Optional;

public class SelectValue implements Interaction {
    private Target elements;
    private String value;

    public SelectValue(Target elements, String value) {
        this.elements = elements;
        this.value = value;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Optional<WebElementFacade> option = elements.resolveAllFor(actor).stream().filter(element -> element.getTextValue().equals(value)).findFirst();
        option.ifPresent(data -> {
            option.get().click();
        });
    }

    public static SelectValue fromOptions(Target elements, String value) {
        return new SelectValue(elements, value);
    }
}
