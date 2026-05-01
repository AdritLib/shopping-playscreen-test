package edu.pe.cibertec.shooping.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Email']/ancestor::android.widget.EditText")
    private WebElement emailField;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Password']/ancestor::android.widget.EditText")
    private WebElement passwordField;
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View[1]/android.widget.Button")
    private WebElement loginButton;

    public LoginPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void withData(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    public void clicksLoginButton() {
        loginButton.click();
    }
}
