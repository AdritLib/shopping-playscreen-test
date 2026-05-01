package edu.pe.cibertec.shooping.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import edu.pe.cibertec.shooping.ui.CatalogScreen;

public class TheCatalogProducts {
    public static Question<Boolean> isVisible(){
        return Visibility.of(CatalogScreen.catalogProducts);
    }
}
