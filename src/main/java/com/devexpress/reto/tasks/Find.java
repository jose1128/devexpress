package com.devexpress.reto.tasks;

import com.devexpress.reto.userinterfaces.ResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;
import java.util.stream.Collectors;

import static com.devexpress.reto.utils.Transformations.replaceValue;
import static com.devexpress.reto.utils.Transformations.stringToInteger;

public class Find implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Integer> prices = ResultsPage.RESULTS_PRICE.resolveAllFor(actor).stream().map(price -> stringToInteger(replaceValue(price.getTextValue(), "$", ""))).collect(Collectors.toList());
        Integer cheapPrice = prices.stream().min(Integer::compareTo).get();
        int indexHotel = prices.indexOf(cheapPrice);
        ResultsPage.CHEAP_HOTEL.resolveAllFor(actor).get(indexHotel).click();
        actor.remember("cheapPrice", cheapPrice);
    }

    public static Find theCheapHotel() {
        return Tasks.instrumented(Find.class);
    }
}
