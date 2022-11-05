package co.com.choucair.certification.proyectoutest.tasks;

import co.com.choucair.certification.proyectoutest.userinterface.UtestDevicePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Devices implements Task{
    public static Performable Navigate() {
        return Tasks.instrumented(Devices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Enter.theValue("Tecno").into(UtestDevicePage.INPUT_COMPUTER),
                Click.on(UtestDevicePage.INPUT_DEVICE),
                WaitUntil.the(UtestDevicePage.SPAN_DEVICE,isVisible()),
                Click.on(UtestDevicePage.SPAN_DEVICE),

                Click.on(UtestDevicePage.INPUT_MODEL),
                WaitUntil.the(UtestDevicePage.SPAN_MODEL,isVisible()),
                Click.on(UtestDevicePage.SPAN_MODEL),

                Click.on(UtestDevicePage.INPUT_OS),
                WaitUntil.the(UtestDevicePage.SPAN_OS,isVisible()),
                Click.on(UtestDevicePage.SPAN_OS),

                Click.on(UtestDevicePage.NEXT_BUTTON)

        );
    }
}
