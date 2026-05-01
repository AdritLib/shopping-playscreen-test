package edu.pe.cibertec.shooping.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import edu.pe.cibertec.shooping.ui.ProfileScreen;

public class Logout implements Task {

    public static Logout logout(){
        return new Logout();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProfileScreen.LOGOUT_BUTTON),
                Click.on(ProfileScreen.CONFIRM_LOGOUT_BUTTON)
        );
    }
}
