package edu.pe.cibertec.shooping.steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.serenitybdd.screenplay.actors.OnStage;

import edu.pe.cibertec.shooping.hooks.AppiumHooks;
import edu.pe.cibertec.shooping.pages.CheckoutPage;
import edu.pe.cibertec.shooping.tasks.Checkout;
import edu.pe.cibertec.shooping.tasks.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {
    CheckoutPage checkoutPage = new CheckoutPage(AppiumHooks.getDriver());

    @Given("que el usuario tiene productos en el carrito")
    public void theUserHaveProductsInShoppingCart(){
        OnStage.theActorCalled("Andrea");
        OnStage.theActorInTheSpotlight()
                .attemptsTo(Login.withCredentials("user1@test.com", "password1"));

        OnStage.theActorInTheSpotlight().attemptsTo(Checkout.putProduct());
    }

    @When("procede al checkout")
    public void proceedsToCheckout(){
        OnStage.theActorInTheSpotlight().attemptsTo(Checkout.proceedsToCheckout());
    }

    @And("ingresa los datos de envio")
    public void inputTheSendData(){
        OnStage.theActorInTheSpotlight()
                .attemptsTo(Checkout.withData());
    }

    @And("confirma la compra")
    public void confirmsTheBuy(){
        checkoutPage.clickConfirmButton();
    }

    @Then("deberia ver el mensaje de compra exitosa")
    public void shouldSeeTheSuccessBuyMessage(){
        OnStage.theActorInTheSpotlight()
                .should(seeThat(Checkout.isConfirmedMessageVisible()));
    }
}
