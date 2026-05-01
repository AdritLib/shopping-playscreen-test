package edu.pe.cibertec.shooping.steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.serenitybdd.screenplay.actors.OnStage;

import edu.pe.cibertec.shooping.hooks.AppiumHooks;
import edu.pe.cibertec.shooping.pages.CatalogPage;
import edu.pe.cibertec.shooping.questions.TheCatalogProducts;
import edu.pe.cibertec.shooping.questions.TheProductList;
import edu.pe.cibertec.shooping.tasks.Catalog;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogSteps {
    CatalogPage catalogPage = new CatalogPage(AppiumHooks.getDriver());

    @When("navega al catalogo de productos")
    public void navigateToProductsCatalog(){
        OnStage.theActorInTheSpotlight()
                .attemptsTo(Catalog.goToAndDisplay());
    }

    @Then("deberia ver la lista de productos disponibles")
    public void shouldSeeAvailableProducts(){
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheCatalogProducts.isVisible()));
    }

    @Given("que el usuario esta en el catalogo")
    public void userIsOnCatalog(){
        OnStage.theActorInTheSpotlight()
                .attemptsTo(Catalog.goToAndDisplay());
    }

    @When("busca el producto {string}")
    public void searchProduct(String product){
        catalogPage.search(product);
    }

    @Then("deberia ver productos que contengan {string}")
    public void shouldSeeProductsInCatalog(String product){
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheProductList.contains(product)));
    }
}
