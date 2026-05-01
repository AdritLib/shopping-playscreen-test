package edu.pe.cibertec.shooping.ui;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsScreen {
    public static Target categoryFilter(String category) {
        return Target
                .the(category + " category filter")
                .located(AppiumBy.xpath("//android.widget.TextView[@text='" + category + "']"));
    }

    public static Target productByName(String productName) {
        return Target
                .the("Product: "+ productName)
                .located(AppiumBy.xpath("//android.widget.TextView[@text='" + productName + "']"));
    }

    public static final Target ADD_PRODUCT_BUTTON = Target.the("first product on list button")
            .located(AppiumBy.xpath("(//android.view.View[@content-desc='Agregar al carrito'])[1]/following-sibling::android.widget.Button[1]"));

}
