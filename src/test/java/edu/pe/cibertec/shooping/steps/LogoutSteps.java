package edu.pe.cibertec.shooping.steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static org.hamcrest.Matchers.equalTo;

import net.serenitybdd.screenplay.actors.OnStage;

import edu.pe.cibertec.shooping.hooks.AppiumHooks;
import edu.pe.cibertec.shooping.pages.LoginPage;
import edu.pe.cibertec.shooping.questions.TheLogoutScreen;
import edu.pe.cibertec.shooping.tasks.Logout;
import edu.pe.cibertec.shooping.tasks.Profile;
import edu.pe.cibertec.shooping.ui.TheMainScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
    LoginPage loginPage = new LoginPage(AppiumHooks.getDriver());

    @Given("que el usuario esta logueado en la aplicacion")
    public void theUserIsLoggedInApp(){
        OnStage.theActorCalled("Andrea");

        loginPage.withData("user1@test.com", "password1");
        loginPage.clicksLoginButton();

        seeThat(TheMainScreen.isVisible(), equalTo(true));
    }

    @When("hace clic en el menu de usuario")
    public void clicksOnUserMenu(){
        OnStage.theActorInTheSpotlight()
                .attemptsTo(Profile.open());
    }

    @And("hace clic en cerrar sesion")
    public void clicksOnLogout(){
        OnStage.theActorInTheSpotlight()
                .attemptsTo(Logout.logout());
    }

    @Then("deberia regresar a la pantalla de login")
    public void shouldReturnToLoginScreen(){
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheLogoutScreen.isVisible(), equalTo(true)));
    }
}
