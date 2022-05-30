package com.devexpress.reto.tasks;

import com.devexpress.reto.interactions.SelectValue;
import com.devexpress.reto.models.Reservation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.devexpress.reto.userinterfaces.HomePage.*;

public class Search implements Task {
    private Reservation reservation;

    public Search(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(LOCATION_FIELD),
                SelectValue.fromOptions(SELECT_OPTION, reservation.getLocation()),
                Enter.theValue(reservation.getCheckIn()).into(CHECK_IN_FIELD),
                Click.on(CHECK_OUT_FIELD),
                Enter.theValue(reservation.getCheckOut()).into(CHECK_OUT_FIELD),
                Click.on(ROOMS_FIELD),
                SelectValue.fromOptions(SELECT_OPTION, reservation.getRooms()),
                Click.on(ADULTS_FIELD),
                SelectValue.fromOptions(SELECT_OPTION, reservation.getAdults()),
                Click.on(CHILDREN_FIELD),
                SelectValue.fromOptions(SELECT_OPTION, reservation.getChildren()),
                Click.on(SEARCH_BUTTON)
        );
    }

    public static Search theDestination(Reservation reservation) {
        return Tasks.instrumented(Search.class, reservation);
    }
}
