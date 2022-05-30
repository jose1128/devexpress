package com.devexpress.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentPage {
    public static final Target TOTAL_TO_PAY = Target.the("").located(By.cssSelector("h4.total-price"));
}
