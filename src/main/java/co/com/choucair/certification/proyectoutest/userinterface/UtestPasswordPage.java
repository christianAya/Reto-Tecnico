package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestPasswordPage extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("Donde se escribe la contraseña")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Donde se escribe la confirmación de contraseña")
            .located(By.id("confirmPassword"));

    public static final Target SPAN_TERMS = Target.the("Donde se aceptan los términos y condiciones")
            .located(By.id("termOfUse"));

    public static final Target SPAN_PRIVACY = Target.the("Donde se aceptan las políticas de seguridad")
            .located(By.id("privacySetting"));

    public static final Target NEXT_BUTTON = Target.the("Boton de Continuar")
            .located(By.xpath("(//span[text()='Complete Setup'])"));

}
