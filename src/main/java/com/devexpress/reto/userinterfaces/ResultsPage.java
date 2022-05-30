package com.devexpress.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ResultsPage {
    public static final Target RESULTS_PRICE = Target.the("").locatedBy("//div[@class = 'night-button']//p");
    public static final Target CHEAP_HOTEL = Target.the("").locatedBy("//div[@class = 'book-it gray-button dx-button dx-button-normal dx-button-mode-contained dx-widget dx-button-has-text']");
}
