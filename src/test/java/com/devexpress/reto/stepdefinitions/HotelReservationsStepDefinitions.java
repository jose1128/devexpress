package com.devexpress.reto.stepdefinitions;

import com.devexpress.reto.models.Reservation;
import com.devexpress.reto.questions.TotalPrice;
import com.devexpress.reto.tasks.Find;
import com.devexpress.reto.tasks.Search;
import com.devexpress.reto.utils.CalculateDays;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.text.ParseException;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class HotelReservationsStepDefinitions {

    @Managed
    private WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
    }


    @Given("^the user search the destination$")
    public void theUserSearchTheDestination(List<Reservation> reservationList) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url("https://js.devexpress.com/Demos/DXHotels/#home"),
                Search.theDestination(reservationList.get(0))
        );
    }

    @When("^select the cheapest hotel$")
    public void selectTheCheapestHotel() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Find.theCheapHotel()
        );
    }

    @Then("^validate the reservation price on days (.*) and (.*)$")
    public void validateTheReservationPrice(String checkIn, String checkOut) throws ParseException {
        int cheapPrice = OnStage.theActorInTheSpotlight().recall("cheapPrice");
        OnStage.theActorInTheSpotlight().should(seeThat(TotalPrice.forReservation(), is(equalTo(CalculateDays.forReservation(checkIn, checkOut, cheapPrice)))));
    }
}
