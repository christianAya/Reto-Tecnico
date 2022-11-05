package co.com.choucair.certification.proyectoutest.tasks;

import co.com.choucair.certification.proyectoutest.userinterface.UtestJoinFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class JoinForm implements Task {

    public static Performable Navigate() {
        return Tasks.instrumented(JoinForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Christian").into(UtestJoinFormPage.INPUT_FIRST_NAME),
                Enter.theValue("Aya").into(UtestJoinFormPage.INPUT_LAST_NAME),
                Enter.theValue("amos18r_f693c@vixej.com").into(UtestJoinFormPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("April").from(UtestJoinFormPage.DROP_DOWN_BIRTH_MONTH),
                SelectFromOptions.byVisibleText("26").from(UtestJoinFormPage.DROP_DOWN_BIRTH_DAY),
                SelectFromOptions.byVisibleText("1999").from(UtestJoinFormPage.DROP_DOWN_BIRTH_YEAR),
                Click.on(UtestJoinFormPage.NEXT_BUTTON));
    }
}
