package edu.pe.cibertec.shooping.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class TheMainScreen {
    private static final Target HOME_INDICATOR = Target
            .the("man screen indicator")
            .located(AppiumBy.xpath("//android.widget.TextView[@text=\"Productos\"]"));
    public static final Target PROFILE_BUTTON = Target.the("profile button")
            .located(AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View[4]/android.view.View[1]"));

    public static final Target CATALOG_BUTTON = Target.the("catalog button")
            .located(AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View[2]/android.view.View[2]"));

    public static final Target SHOPPING_CART_BUTTON = Target.the("shopping cart button")
            .located(AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View[3]/android.view.View[2]"));

    public static Question<Boolean> isVisible() {
        return Visibility.of(HOME_INDICATOR).asBoolean();
    }
}
