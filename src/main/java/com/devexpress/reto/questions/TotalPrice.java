package com.devexpress.reto.questions;

import com.devexpress.reto.userinterfaces.PaymentPage;
import com.devexpress.reto.utils.Transformations;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TotalPrice implements Question<Integer> {
    @Override
    public Integer answeredBy(Actor actor) {
        String priceText = Transformations.replaceValue(PaymentPage.TOTAL_TO_PAY.resolveFor(actor).getTextValue(), "$", "");
        return Transformations.stringToInteger(Transformations.splitGetValue(priceText, "\\.", 0));
    }

    public static TotalPrice forReservation() {
        return new TotalPrice();
    }
}
