package edu.pe.cibertec.shooping.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckoutPage {
    private final AppiumDriver driver;
    public CheckoutPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickConfirmButton(){
        String scrollSelector = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Confirmar Compra\"))";
        driver.findElement(AppiumBy.androidUIAutomator(scrollSelector));

        WebElement btn = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Confirmar Compra']/following-sibling::android.widget.Button"));
        btn.click();
    }
}
