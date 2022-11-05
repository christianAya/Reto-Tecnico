package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDevicePage extends PageObject {

    public static final Target INPUT_DEVICE = Target.the("Campo donde se selecciona el tipo de dispositivo")
            .located(By.xpath("//span[text()='Select Brand']"));
    public static final Target SPAN_DEVICE = Target.the("Selección de tipo de dispositivo")
            .located(By.xpath("//*[text()='Apple']"));

    public static final Target INPUT_MODEL = Target.the("Campo donde se selecciona el modelo")
            .located(By.xpath("//span[text()='Select a Model']"));

    public static final Target SPAN_MODEL = Target.the("Selección del modelo")
            .located(By.xpath("//*[text()='iPhone']"));

    public static final Target INPUT_OS = Target.the("Campo donde se selecciona el sistema operativo")
            .located(By.xpath("(//span[text()='Select OS'])[2]"));

    public static final Target SPAN_OS = Target.the("Selección del Sistema Operativo")
            .located(By.xpath("//*[text()='iOS 2.0']"));

    public static final Target NEXT_BUTTON = Target.the("Botón de Continuar")
            .located(By.xpath("(//span[text()='Next: Last Step'])"));
}
