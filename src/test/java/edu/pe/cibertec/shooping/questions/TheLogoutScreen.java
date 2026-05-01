package edu.pe.cibertec.shooping.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import edu.pe.cibertec.shooping.ui.LoginScreen;

public class TheLogoutScreen {
    public static Question<Boolean> isVisible(){
        return Visibility.of(LoginScreen.LOGIN_BUTTON);
    }
}
