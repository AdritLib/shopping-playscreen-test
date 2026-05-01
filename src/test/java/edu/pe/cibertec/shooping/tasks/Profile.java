package edu.pe.cibertec.shooping.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import edu.pe.cibertec.shooping.ui.TheMainScreen;

public class Profile {
    public static Task open(){
        return Task.where("{0} opens profile menu", Click.on(TheMainScreen.PROFILE_BUTTON));
    }
}
