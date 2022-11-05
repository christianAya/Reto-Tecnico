package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSuccessPage extends PageObject {

    public static final Target LABEL_SUCCESS = Target.the("Mensaje Existoso")
            .located(By.xpath("//h1[text()=\"Welcome to the world's largest community of freelance software testers!\"]"));
}
