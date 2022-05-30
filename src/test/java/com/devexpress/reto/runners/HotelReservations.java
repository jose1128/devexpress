package com.devexpress.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/hotel-reservations.feature",
        glue = "com.devexpress.reto.stepdefinitions",
        snippets = SnippetType.CAMELCASE, dryRun = false
)

public class HotelReservations {
}
