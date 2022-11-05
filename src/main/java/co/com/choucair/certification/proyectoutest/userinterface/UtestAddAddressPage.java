package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestAddAddressPage extends PageObject {

    public static final Target NEXT_BUTTON = Target.the("Boton de Continuar")
            .located(By.xpath("//div[@class='pull-right next-step']" +
                    "//span[contains(text(),'Next: Devices')]"));
}
