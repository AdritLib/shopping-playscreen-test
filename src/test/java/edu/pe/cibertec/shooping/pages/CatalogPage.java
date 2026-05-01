package edu.pe.cibertec.shooping.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CatalogPage {
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Buscar\"]/ancestor::android.widget.EditText")
    private WebElement searchFieldProduct;

    public CatalogPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void search(String product){
        searchFieldProduct.sendKeys(product);
    }
}
