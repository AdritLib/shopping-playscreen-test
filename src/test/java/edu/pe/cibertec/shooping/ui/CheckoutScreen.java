package edu.pe.cibertec.shooping.ui;

import net.serenitybdd.screenplay.targets.Target;

import io.appium.java_client.AppiumBy;

public class CheckoutScreen {
    public static final Target CHECKOUT_BUTTON = Target.the("checkout button")
            .located(AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button"));

    public static final Target NUM_FIELD = Target.the("Number field")
            .located(AppiumBy.xpath("//android.widget.TextView[@text='Número de tarjeta']/ancestor::android.widget.EditText"));

    public static final Target DUE_DATE_FIELD = Target.the("Due date field")
            .located(AppiumBy.xpath("//android.widget.TextView[@text='MM/YY']/ancestor::android.widget.EditText"));

    public static final Target SECURITY_NUM_FIELD = Target.the("Security Number Field")
            .located(AppiumBy.xpath("//android.widget.TextView[@text='CVV']/ancestor::android.widget.EditText"));

    public static final Target CONFIRMED_MESSAGE = Target.the("Confirmed Buy Message")
            .located(AppiumBy.xpath("//android.widget.TextView[@text='¡Pedido Confirmado!']"));


}
