package edu.pe.cibertec.shooping.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import edu.pe.cibertec.shooping.ui.CatalogScreen;
import edu.pe.cibertec.shooping.ui.TheMainScreen;

public class Catalog {
    public static Task goToAndDisplay(){
        return Task.where(
                Click.on(TheMainScreen.CATALOG_BUTTON),
                Click.on(CatalogScreen.catalogElectronic)
        );
    }
}
