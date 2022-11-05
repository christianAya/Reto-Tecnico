package co.com.choucair.certification.proyectoutest.tasks;

import co.com.choucair.certification.proyectoutest.userinterface.UtestPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AddPassword implements Task {
    public static Performable Navigate() {
        return Tasks.instrumented(AddPassword.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Contrase1234@").into(UtestPasswordPage.INPUT_PASSWORD),
                Enter.theValue("Contrase1234@").into(UtestPasswordPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestPasswordPage.SPAN_TERMS),
                Click.on(UtestPasswordPage.SPAN_PRIVACY),
                Click.on(UtestPasswordPage.NEXT_BUTTON)
        );
    }
}
