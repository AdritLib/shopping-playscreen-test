package edu.pe.cibertec.shooping.ui;

import net.serenitybdd.screenplay.targets.Target;

import io.appium.java_client.AppiumBy;

public class CatalogScreen {
    public static final Target catalogElectronic = Target.the("electronic catalog button")
            .located(AppiumBy.xpath("//android.view.View[@content-desc=\"Electrónica\"]"));

    public static final Target catalogProducts = Target.the("catalog products")
            .located(AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[4]"));
}
