package edu.pe.cibertec.shooping.ui;

import net.serenitybdd.screenplay.targets.Target;

import io.appium.java_client.AppiumBy;

public class ProfileScreen {
    public static final Target LOGOUT_BUTTON = Target.the("logout button").located(AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
    public static final Target CONFIRM_LOGOUT_BUTTON = Target.the("confirm logout button").located(AppiumBy.xpath("//android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
}
