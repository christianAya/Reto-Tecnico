package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinFormPage extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("Donde se escribe el nombre")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("Donde se escribe el apellido")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Donde se escibre el email")
            .located(By.id("email"));

    public static final Target DROP_DOWN_BIRTH_MONTH = Target.the("Donde se elige el mes de nacimiento")
            .located(By.id("birthMonth"));

    public static final Target DROP_DOWN_BIRTH_DAY = Target.the("Donde se elige el día de nacimiento")
            .located(By.id("birthDay"));

    public static final Target DROP_DOWN_BIRTH_YEAR = Target.the("Donde se elige el año de nacimiento")
            .located(By.id("birthYear"));

    public static final Target NEXT_BUTTON = Target.the("Boton de Continuar")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']" +
                    "//span[contains(text(),'Next: Location')]"));

}
