package edu.pe.cibertec.shooping.tasks;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Visibility;

import edu.pe.cibertec.shooping.ui.CheckoutScreen;
import edu.pe.cibertec.shooping.ui.ProductsScreen;
import edu.pe.cibertec.shooping.ui.TheMainScreen;

public class Checkout {
    public static Task putProduct(){
        return Task.where(
                Click.on(ProductsScreen.ADD_PRODUCT_BUTTON)
        );
    }
    public static Task proceedsToCheckout(){
        return Task.where(
                Click.on(TheMainScreen.SHOPPING_CART_BUTTON),
                Click.on(CheckoutScreen.CHECKOUT_BUTTON)
        );
    }
    public static Task withData(){
        return Task.where(
                Enter.theValue("1112223334441123").into(CheckoutScreen.NUM_FIELD),
                Enter.theValue("11/2030").into(CheckoutScreen.DUE_DATE_FIELD),
                Enter.theValue("1234").into(CheckoutScreen.SECURITY_NUM_FIELD)
        );
    }
    public static Question<Boolean> isConfirmedMessageVisible(){
        return Visibility.of(CheckoutScreen.CONFIRMED_MESSAGE);
    }
}
