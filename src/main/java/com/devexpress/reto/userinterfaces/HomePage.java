package com.devexpress.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target LOCATION_FIELD = Target.the("Location input").locatedBy("//input[contains(@id, '_location')]");
    public static final Target CHECK_IN_FIELD = Target.the("Check in input").locatedBy("//input[contains(@id, '_checkIn')]");
    public static final Target CHECK_OUT_FIELD = Target.the("Check out input").locatedBy("//input[contains(@id, '_checkOut')]");
    public static final Target ROOMS_FIELD = Target.the("Rooms input").locatedBy("//input[contains(@id, '_rooms')]");
    public static final Target ADULTS_FIELD = Target.the("Adults input").locatedBy("//input[contains(@id, '_adults')]");
    public static final Target CHILDREN_FIELD = Target.the("Children input").locatedBy("//input[contains(@id, '_children')]");
    public static final Target SEARCH_BUTTON = Target.the("Search button").located(By.className("button-search"));
    public static final Target SELECT_OPTION = Target.the("option").locatedBy("//div[@data-bind = 'dxControlsDescendantBindings: true']//div[@class = 'dx-item-content dx-list-item-content']");

}
